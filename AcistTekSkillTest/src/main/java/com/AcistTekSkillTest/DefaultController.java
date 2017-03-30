package com.AcistTekSkillTest;

import com.AcistTekSkillTest.domain.Link;
import com.AcistTekSkillTest.services.link.LinkManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Daniel on 1/29/2017.
 */
@Controller
@RequestMapping
public class DefaultController {

    @Autowired
    private LinkManagementService linkManagementService;

    private Link link;

    @RequestMapping ("/")
    public String showLink(ModelMap modelMap){
        modelMap.addAttribute("Message","Hello");
        return "MainPage";
    }
}
