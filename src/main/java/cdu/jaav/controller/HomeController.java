package cdu.jaav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//负责页面的跳转
@Controller
public class HomeController {
    //    所有学生页面
    @GetMapping("/studentList")
    public String studentList() {
        return "student/studentList";
    }

    //    违规学生页面
    @GetMapping("/badstudentList")
    public String badstudentList() {
        return "student/badstudentList";
    }

    //主页面
    @GetMapping("/main")
    public String main() {
        return "main";
    }

    //全部位子页面
    @GetMapping("/deskList")
    public String deskList() {
        return "desk/deskList";
    }
}
