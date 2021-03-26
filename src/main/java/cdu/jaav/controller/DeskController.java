package cdu.jaav.controller;

import cdu.jaav.entity.Desk;
import cdu.jaav.service.DeskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Desk)表控制层
 *
 * @author makejava
 * @since 2021-03-25 08:14:39
 */
@RestController
@RequestMapping("desk")
public class DeskController {
    /**
     * 服务对象sagahasknaksmals,a;
     */
    @Resource
    private DeskService deskService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Desk selectOne(Integer id) {
        return this.deskService.queryById(id);
    }

}