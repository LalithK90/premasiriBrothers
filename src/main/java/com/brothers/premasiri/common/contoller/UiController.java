package com.brothers.premasiri.common.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UiController {

    @GetMapping("/index")
    public String showIndexPage() {
        return "index";
    }

    @GetMapping("/home")
    public String mainwindow(){
         return "mainwindow";
    }

    @GetMapping("/login")
    public String login(){
        return "login/login";
    }

/*    @GetMapping("/fonts/glyphicons-halflings-regular.woff")
    public String login(){
        return "mainwindow";
    }*/

/*    @GetMapping("/loginErr")
    public String loginErr(Model model){
        model.addAttribute("error", true);
        return "login/login";
    }*/

    }
