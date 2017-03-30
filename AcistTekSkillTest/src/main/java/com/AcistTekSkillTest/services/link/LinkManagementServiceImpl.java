package com.AcistTekSkillTest.services.link;


import com.AcistTekSkillTest.dao.LinkDao;
import com.AcistTekSkillTest.dao.RecordNotFoundException;
import com.AcistTekSkillTest.domain.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Daniel on 1/25/2017.
 */
@Service
@Transactional
public class LinkManagementServiceImpl implements  LinkManagementService{

    private LinkDao linkDao;
    @Autowired
    public LinkManagementServiceImpl(LinkDao linkDao) {
        this.linkDao = linkDao;
    }
    @Override
    public void newLink(Link link) {
        linkDao.create(link);
    }
    @Override
    public void updateLink(Link link) throws LinkNotFoundException, RecordNotFoundException {
        try {
            linkDao.update(link);
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException();
        }
    }
    @Override
    public void deleteLink(int oldLink) throws LinkNotFoundException, RecordNotFoundException {

        try {
            linkDao.delete(oldLink);
        } catch (RecordNotFoundException e) {
            throw new RecordNotFoundException();
        }
    }
    @Override
    public Link findLinkById(int linkId) throws LinkNotFoundException {
        try{
        return   linkDao.getById(linkId);
        } catch (RecordNotFoundException e) {
           throw new LinkNotFoundException();
        }
    }
    @Override
    public List<Link> showAllLink() {
      return linkDao.showAllLink();
    }
}
