package cdu.jaav.service;

import cdu.jaav.entity.Student;
import cdu.jaav.entity.utils.ResponseData;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2021-03-25 08:21:26
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Student queryById(Integer sid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Student> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sid);

    //查询所有违规学生
    ResponseData<List> queryByFlag(int page, int limit);

    //查询所有学生信息
    ResponseData<List> queryAllByPage(int page, int limit);
}