package cdu.jaav.service.impl;

import cdu.jaav.dao.MangerDao;
import cdu.jaav.entity.Manger;
import cdu.jaav.service.MangerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Manger)表服务实现类
 *
 * @author makejava
 * @since 2021-03-25 08:14:31
 */
@Service("mangerService")
public class MangerServiceImpl implements MangerService {
    @Resource
    private MangerDao mangerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mid 主键
     * @return 实例对象
     */
    @Override
    public Manger queryById(Integer mid) {
        return this.mangerDao.queryById(mid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Manger> queryAllByLimit(int offset, int limit) {
        return this.mangerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param manger 实例对象
     * @return 实例对象
     */
    @Override
    public Manger insert(Manger manger) {
        this.mangerDao.insert(manger);
        return manger;
    }

    /**
     * 修改数据
     *
     * @param manger 实例对象
     * @return 实例对象
     */
    @Override
    public Manger update(Manger manger) {
        this.mangerDao.update(manger);
        return this.queryById(manger.getMid());
    }

    /**
     * 通过主键删除数据
     *
     * @param mid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mid) {
        return this.mangerDao.deleteById(mid) > 0;
    }
}