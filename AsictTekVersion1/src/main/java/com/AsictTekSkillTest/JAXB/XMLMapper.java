package com.AsictTekSkillTest.JAXB;

import com.AsictTekSkillTest.domain.Link;
import com.AsictTekSkillTest.services.link.LinkManagementService;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import sun.security.jca.GetInstance;

import javax.xml.transform.Result;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

/**
 * Created by Daniel on 4/4/2017.
 */

public class XMLMapper  {


    private LinkManagementService linkerServices;
    public void mapper(){
        List<Link> linkList=linkerServices. showAllLink();
        Jaxb2Marshaller jaxb2Marshaller= new Jaxb2Marshaller();
        jaxb2Marshaller.setMappedClass(Link.class);
        jaxb2Marshaller.marshal(linkList, (Result) System.out);
    }


}
