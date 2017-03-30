package com.AcistTekSkillTest.dao;


import com.AcistTekSkillTest.domain.Quote;
import com.AcistTekSkillTest.services.quote.QuoteNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Daniel on 1/25/2017.
 */
@Repository
public class QuoteDaoImpl implements QuoteDao {

    private static final Logger logger = LoggerFactory.getLogger(QuoteDaoImpl.class);


    private HibernateTemplate hibernateTemplate;

    @Autowired
    public QuoteDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Override
    public void create(Quote quote) {
        hibernateTemplate.save(quote);
    }

    @Override
    public Quote getById(int linkId) throws RecordNotFoundException {
        return (Quote) hibernateTemplate.findByNamedQuery("from Quote",linkId);
    }

    @Override
    public List<Quote> getByTitle(String title) throws QuoteNotFoundException {
        return null;
    }

    @Override
    public void update(Quote linkToUpdate) throws RecordNotFoundException {

    }

    @Override
    public void delete(Quote oldLink) throws RecordNotFoundException {

    }
}
