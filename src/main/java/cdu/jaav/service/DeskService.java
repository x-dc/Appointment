package cdu.jaav.service;

import cdu.jaav.entity.Desk;
import cdu.jaav.entity.utils.ResponseData;

import java.util.List;

/**
 * (Desk)表服务接口
 *
 * @author makejava
 * @since 2021-03-25 08:14:38
 */
public interface DeskService {

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    Desk queryById(Integer did);


    /**
     * 新增数据
     *
     * @param desk 实例对象
     * @return 实例对象
     */
    Desk insert(Desk desk);

    /**
     * 修改数据
     *
     * @param desk 实例对象
     * @return 实例对象
     */
    Desk update(Desk desk);

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 是否成功
     */
    boolean deleteById(Integer did);

    //、、、、、、、、、、、、、、、
    //    查询空闲位置（分页）
    ResponseData<List> queryAllByLimit(int offset, int limit);

    //    查询所有位置（分页）
    ResponseData<List> queryAllDeskByLimit(int page, int limit);
}