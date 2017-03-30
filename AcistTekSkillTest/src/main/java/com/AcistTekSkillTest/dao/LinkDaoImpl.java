package com.AcistTekSkillTest.dao;


import com.AcistTekSkillTest.domain.Link;
import com.AcistTekSkillTest.services.link.LinkNotFoundException;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Daniel on 1/25/2017.
 */
@Repository
public class LinkDaoImpl implements LinkDao {

    private HibernateTemplate hibernateTemplate;

    @Autowired
    public LinkDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

@Override
    public void create(Link link) {
    hibernateTemplate.save(link);
    }
    @Override
    public Link getById(int linkId) throws RecordNotFoundException {

        return (Link) hibernateTemplate.getSessionFactory().getCurrentSession().
                createCriteria(Link.class).
                add(Restrictions.eq("linkId", linkId)).uniqueResult();
    }
    @Override
    public List<Link> getByTitle(String title) throws LinkNotFoundException {
    List<Link> links= (List<Link>) hibernateTemplate.findByNamedQuery("from link",title);
    if (links.isEmpty()){
    throw new LinkNotFoundException();
    }
        return links;
    }

    @Override
    public void update(Link linkToUpdate) throws RecordNotFoundException {
    hibernateTemplate.update(linkToUpdate);
    }

    @Override
    public void delete(int oldLink) throws RecordNotFoundException {
        Link foundLink= (Link) hibernateTemplate.getSessionFactory().getCurrentSession()
                .createCriteria(Link.class).add(Restrictions.eq("linkId",oldLink));
        hibernateTemplate.delete(foundLink);
    }
    @Override
    public List<Link>  showAllLink() {
        List<Link> links =  hibernateTemplate.getSessionFactory().getCurrentSession().createCriteria(Link.class).list();
        return links;
    }
}
