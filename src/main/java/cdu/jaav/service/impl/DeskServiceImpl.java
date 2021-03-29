package cdu.jaav.service.impl;

import cdu.jaav.dao.DeskDao;
import cdu.jaav.entity.DTO.DeskRoomDTO;
import cdu.jaav.entity.Desk;
import cdu.jaav.entity.utils.ResponseData;
import cdu.jaav.entity.utils.ResultEnums;
import cdu.jaav.service.DeskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Desk)表服务实现类
 *
 * @author makejava
 * @since 2021-03-25 08:14:39
 */
@Service("deskService")
public class DeskServiceImpl implements DeskService {
    @Resource
    private DeskDao deskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    @Override
    public Desk queryById(Integer did) {
        return this.deskDao.queryById(did);
    }


    /**
     * 新增数据
     *
     * @param desk 实例对象
     * @return 实例对象
     */
    @Override
    public Desk insert(Desk desk) {
        this.deskDao.insert(desk);
        return desk;
    }

    /**
     * 修改数据
     *
     * @param desk 实例对象
     * @return 实例对象
     */
    @Override
    public Desk update(Desk desk) {
        this.deskDao.update(desk);
        return this.queryById(desk.getDid());
    }

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer did) {
        return this.deskDao.deleteById(did) > 0;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public ResponseData<List> queryAllByLimit(int offset, int limit) {
        int start;
        if (offset==1){
            start=0;
        }else {
            start=offset*limit;
        }
        int i = deskDao.queryAllFreeCount();
        List<DeskRoomDTO> desks = deskDao.queryAllByLimit(start, limit);
        return new ResponseData<>(ResultEnums.SUCCESS,desks,i);
    }

    @Override
    public ResponseData<List> queryAllDeskByLimit(int offset, int limit) {
        int start;
        if (offset==1){
            start=0;
        }else {
            start=offset*limit;
        }
        List<DeskRoomDTO> deskRoomDTOS = deskDao.queryAllDesk(start,limit);
        int i = deskDao.queryAllCount();
        return new ResponseData<>(ResultEnums.SUCCESS,deskRoomDTOS,i);
    }
}