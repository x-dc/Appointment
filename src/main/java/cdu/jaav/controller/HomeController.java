package cdu.jaav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/studentList")
    public String studentList() {
        return "student/studentList";
    }

    @GetMapping("/badstudentList")
    public String badstudentList() {
        return "student/badstudentList";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }
}
