package cdu.jaav.service;

import cdu.jaav.entity.Manger;

import java.util.List;

/**
 * (Manger)表服务接口
 *
 * @author makejava
 * @since 2021-03-25 08:14:31
 */
public interface MangerService {

    /**
     * 通过ID查询单条数据
     *
     * @param mid 主键
     * @return 实例对象
     */
    Manger queryById(Integer mid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Manger> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param manger 实例对象
     * @return 实例对象
     */
    Manger insert(Manger manger);

    /**
     * 修改数据
     *
     * @param manger 实例对象
     * @return 实例对象
     */
    Manger update(Manger manger);

    /**
     * 通过主键删除数据
     *
     * @param mid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mid);

}