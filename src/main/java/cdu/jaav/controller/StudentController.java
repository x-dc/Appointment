package cdu.jaav.controller;

import cdu.jaav.entity.Student;
import cdu.jaav.entity.utils.ResponseData;
import cdu.jaav.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2021-03-25 08:21:27
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;

    //    查看全部学生
    @GetMapping("selectAllStudentByPage")
    public ResponseData<List> selectAllStudentByPage(int page, int limit) {
        return studentService.queryAllByPage(page, limit);
    }

    //    查看有违规记录的学生
    @GetMapping("selectStudentBad")
    public ResponseData<List> selectStudentBad(int page, int limit) {
        ResponseData<List> listResponseData = studentService.queryByFlag(page, limit);
        return listResponseData;
    }

    //    添加学生
    @PutMapping("insertStudent")
    public ResponseData insertStudent(Student student) {
//        System.out.println(student);
        return studentService.insert(student);
    }

    //通过sid删除学生
    @DeleteMapping("deleteStudentById")
    public ResponseData deleteStudentById(int sid) {
//        System.out.println(id);
        return studentService.deleteById(sid);
    }
    //修改学生账号状态
    @PatchMapping("modifyStudentStatus")
    public ResponseData modifyStudentStatus(Student student){
//        System.out.println(student);
        return studentService.updateStatus(student);
    }
}