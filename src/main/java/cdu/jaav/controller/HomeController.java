package cdu.jaav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//sjksjk
//askasjasl
@Controller
//sajksak
public class HomeController {
    @GetMapping("/hello")
    public String index() {
        return "helloView";
    }

    @GetMapping("/studentList")
    public String studentList() {
        return "studentList";
    }

    @GetMapping("/badstudentList")
    public String badstudentList() {
        return "badstudentList";
    }


//    @GetMapping
}
