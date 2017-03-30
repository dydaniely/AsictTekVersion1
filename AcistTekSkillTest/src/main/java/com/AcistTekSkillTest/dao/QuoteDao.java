package com.AcistTekSkillTest.dao;



import com.AcistTekSkillTest.domain.Quote;
import com.AcistTekSkillTest.services.quote.QuoteNotFoundException;

import java.util.List;

/**
 * Created by Daniel on 1/25/2017.
 */
public interface QuoteDao {

    public void create(Quote quote);

    /**
     * Finds a link  based on their ID
     */
    public Quote getById(int linkId) throws RecordNotFoundException;


    public List<Quote> getByTitle(String title) throws QuoteNotFoundException;
    /**
     * Updates the specified link in the database.
     */
    public void update(Quote linkToUpdate) throws RecordNotFoundException;

    /**
     * Delete the specified link from the database.
     */
    public void delete(Quote oldLink) throws RecordNotFoundException;
}
