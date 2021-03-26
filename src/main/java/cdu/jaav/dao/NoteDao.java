package cdu.jaav.dao;

import cdu.jaav.entity.Note;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Note)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-25 17:27:37
 */
public interface NoteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mid 主键
     * @return 实例对象
     */
    Note queryById(Integer mid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Note> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param note 实例对象
     * @return 对象列表
     */
    List<Note> queryAll(Note note);

    /**
     * 新增数据
     *
     * @param note 实例对象
     * @return 影响行数
     */
    int insert(Note note);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Note> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Note> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Note> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Note> entities);

    /**
     * 修改数据
     *
     * @param note 实例对象
     * @return 影响行数
     */
    int update(Note note);

    /**
     * 通过主键删除数据
     *
     * @param mid 主键
     * @return 影响行数
     */
    int deleteById(Integer mid);

}