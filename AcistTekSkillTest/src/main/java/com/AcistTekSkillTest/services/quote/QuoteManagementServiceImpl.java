package com.AcistTekSkillTest.services.quote;


import com.AcistTekSkillTest.dao.QuoteDao;
import com.AcistTekSkillTest.domain.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Daniel on 1/25/2017.
 */
@Transactional
@Service
public class QuoteManagementServiceImpl implements  QuoteManagementService {

    private QuoteDao quoteDao;

    @Autowired
    public QuoteManagementServiceImpl(QuoteDao quoteDao) {
        this.quoteDao = quoteDao;
    }

    @Override
    public void newQuote(Quote quote) {
    }

    @Override
    public void updateQuote(Quote quote) throws QuoteNotFoundException {

    }

    @Override
    public void deleteQuote(Quote oldQuote) throws QuoteNotFoundException {

    }

    @Override
    public void findQuoteById(int quoteId) throws QuoteNotFoundException {

    }
}
