package com.SmartCardContactManager.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

   @RequestMapping("/homes")
    public String home(Model model){
//       model.addText("title", "Home");
       model.add
        return "home";
    }



}
