package cdu.jaav.controller;

import cdu.jaav.entity.Room;
import cdu.jaav.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Room)表控制层
 *
 * @author makejava
 * @since 2021-03-25 08:14:04
 */
@RestController
@RequestMapping("room")
public class RoomController {
    /**
     * 服务对象
     */
//    asjaksa
    @Resource
    private RoomService roomService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Room selectOne(Integer id) {
        return this.roomService.queryById(id);
    }

}