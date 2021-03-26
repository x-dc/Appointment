package cdu.jaav.dao;

import cdu.jaav.entity.Manger;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Manger)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-25 08:14:31
 */
public interface MangerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mid 主键
     * @return 实例对象
     */
    Manger queryById(Integer mid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Manger> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param manger 实例对象
     * @return 对象列表
     */
    List<Manger> queryAll(Manger manger);

    /**
     * 新增数据
     *
     * @param manger 实例对象
     * @return 影响行数
     */
    int insert(Manger manger);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Manger> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Manger> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Manger> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Manger> entities);

    /**
     * 修改数据
     *
     * @param manger 实例对象
     * @return 影响行数
     */
    int update(Manger manger);

    /**
     * 通过主键删除数据
     *
     * @param mid 主键
     * @return 影响行数
     */
    int deleteById(Integer mid);

}