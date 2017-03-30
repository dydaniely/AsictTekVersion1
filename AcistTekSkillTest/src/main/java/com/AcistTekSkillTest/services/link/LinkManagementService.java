package com.AcistTekSkillTest.services.link;


import com.AcistTekSkillTest.dao.RecordNotFoundException;
import com.AcistTekSkillTest.domain.Link;

import java.util.List;

/**
 * Created by Daniel on 1/25/2017.
 */
public interface LinkManagementService {

    public void newLink(Link link);
    public void updateLink(Link link) throws LinkNotFoundException, RecordNotFoundException;
    public void deleteLink(int oldLink) throws LinkNotFoundException, RecordNotFoundException;
    public Link findLinkById(int linkId) throws LinkNotFoundException;
    public List<Link> showAllLink();


}
