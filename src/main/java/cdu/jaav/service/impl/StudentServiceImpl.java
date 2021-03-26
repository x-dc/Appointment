package cdu.jaav.service.impl;

import cdu.jaav.dao.StudentDao;
import cdu.jaav.entity.Student;
import cdu.jaav.entity.utils.ResponseData;
import cdu.jaav.entity.utils.ResultEnums;
import cdu.jaav.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2021-03-25 08:21:27
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer sid) {
        return this.studentDao.queryById(sid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Student> queryAllByLimit(int offset, int limit) {
        return this.studentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sid) {
        return this.studentDao.deleteById(sid) > 0;
    }




    @Override
    public ResponseData<List> queryByFlag(int page, int limit) {
        int start;
        if (page==0){
            start=0;
        }else {
            start=page*limit;
        }
        int i = studentDao.queryAllBadCount();
        List<Student> students = studentDao.queryByFlag(start,limit);
        return new ResponseData<>(ResultEnums.SUCCESS,students,i);
    }

    @Override
    public ResponseData<List> queryAllByPage(int page, int limit) {
        int start;
        if (page==1){
            start=0;
        }else {
            start=page*limit;
        }
        int i = studentDao.queryAllCount();
        List<Student> students = studentDao.queryAllByLimit(start, limit);
        return new ResponseData<List>(ResultEnums.SUCCESS,students,i);
    }
}