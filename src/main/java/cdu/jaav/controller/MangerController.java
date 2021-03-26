package cdu.jaav.controller;

import cdu.jaav.entity.Manger;
import cdu.jaav.service.MangerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Manger)表控制层
 *
 * @author makejava
 * @since 2021-03-25 08:14:31
 */
@RestController
@RequestMapping("manger")
public class MangerController {
    /**
     * 服务对象
     */
    @Resource
    private MangerService mangerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Manger selectOne(Integer id) {
        return this.mangerService.queryById(id);
    }

//    asjkjdka
}
//asklaaslks