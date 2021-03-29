package cdu.jaav.dao;

import cdu.jaav.entity.DTO.DeskRoomDTO;
import cdu.jaav.entity.Desk;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Desk)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-25 08:14:38
 */
public interface DeskDao {

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    Desk queryById(Integer did);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */


    /**
     * 通过实体作为筛选条件查询
     *
     * @param desk 实例对象
     * @return 对象列表
     */
    List<Desk> queryAll(Desk desk);

    /**
     * 新增数据
     *
     * @param desk 实例对象
     * @return 影响行数
     */
    int insert(Desk desk);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Desk> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Desk> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Desk> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Desk> entities);

    /**
     * 修改数据
     *
     * @param desk 实例对象
     * @return 影响行数
     */
    int update(Desk desk);

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 影响行数
     */
    int deleteById(Integer did);

    //查询所有空闲位子
    List<DeskRoomDTO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    //查询空闲位子的数量
    int queryAllFreeCount();

    List<DeskRoomDTO> queryAllDesk(@Param("offset") int offset, @Param("limit") int limit);

    //查询所有位子的数量
    int queryAllCount();

    int updateStatus(@Param("id") Integer integer);
}