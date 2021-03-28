package cdu.jaav.controller;

import cdu.jaav.entity.Desk;
import cdu.jaav.entity.utils.ResponseData;
import cdu.jaav.service.DeskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
     * 服务对象;
     */
    @Resource
    private DeskService deskService;

//    查询空闲位置
    @GetMapping("getFreeDesk")
    private ResponseData<List> getFreeDesk(int page,int limit){
        ResponseData<List> listResponseData = deskService.queryAllByLimit(page, limit);
        return listResponseData;
    }
}