package com.AsictTekSkillTest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Daniel on 1/29/2017.
 */
@Controller
@RequestMapping("/")
public class DefaultController {
 private final static  Logger logger= Logger.getLogger(DefaultController.class);

     @RequestMapping(value="/",method = RequestMethod.GET)
    public String HomePage(ModelMap model) {
      logger.debug("HomePage Method executed");
        model.addAttribute("Message","AscitTekJavaSkillTest");
        return "MainPage";
                }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(ModelMap model) {
        logger.debug("HomePage Method executed");
        model.addAttribute("Message","AscitTekJavaSkillTest");
        return "login";
    }

}
