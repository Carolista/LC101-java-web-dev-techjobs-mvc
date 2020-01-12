package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController extends TechJobsController {

    public HomeController() {
        super();
    }

    @RequestMapping(value = "")
    public String index(Model model) {



        model.addAttribute("actions", actionChoices);
        model.addAttribute("title", "Available Jobs");

        return "index";
    }

}
