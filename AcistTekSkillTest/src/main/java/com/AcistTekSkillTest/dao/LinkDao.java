package com.AcistTekSkillTest.dao;


import com.AcistTekSkillTest.domain.Link;
import com.AcistTekSkillTest.services.link.LinkNotFoundException;

import java.util.List;

/**
 * Created by Daniel on 1/25/2017.
 */
public interface LinkDao {

    public void create(Link link);

    /**
     * Finds a link  based on their ID
     */
    public Link getById(int linkId) throws RecordNotFoundException;


    public List<Link> getByTitle(String title) throws LinkNotFoundException;
    /**
     * Updates the specified link in the database.
     */
    public void update(Link linkToUpdate) throws RecordNotFoundException;


    /**
     * Delete the specified link from the database.
     */
    public void delete(int oldLink) throws RecordNotFoundException;

    public List<Link> showAllLink();
}
