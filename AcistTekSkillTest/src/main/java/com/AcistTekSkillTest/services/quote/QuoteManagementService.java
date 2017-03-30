package com.AcistTekSkillTest.services.quote;


import com.AcistTekSkillTest.domain.Quote;

/**
 * Created by Daniel on 1/25/2017.
 */
public interface QuoteManagementService {
    public void newQuote(Quote quote);
    public void updateQuote(Quote quote) throws QuoteNotFoundException;
    public void deleteQuote(Quote oldQuote)throws QuoteNotFoundException;
    public void findQuoteById(int quoteId) throws QuoteNotFoundException;
}
