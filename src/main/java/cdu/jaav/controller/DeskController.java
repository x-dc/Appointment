package cdu.jaav.controller;

import cdu.jaav.entity.Desk;
import cdu.jaav.entity.utils.ResponseData;
import cdu.jaav.entity.utils.ResultEnums;
import cdu.jaav.service.DeskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public ResponseData<List> getFreeDesk(int page, int limit) {
        ResponseData<List> listResponseData = deskService.queryAllByLimit(page, limit);
        return listResponseData;
    }

    //    查询所有位子
    @GetMapping("queryAllDesk")
    public ResponseData<List> queryAllDesk(int page, int limit) {
        ResponseData<List> listResponseData = deskService.queryAllDeskByLimit(page, limit);
        return listResponseData;
    }

////    释放位子
//    @GetMapping("releaseDesk")
//    public ResponseData releaseDesk(ArrayList<Integer> arrayList){
//        for (Integer integer : arrayList) {
//            ResponseData responseData = deskService.releaseDesk(integer);
//        }
//        return new ResponseData(ResultEnums.SUCCESS);
//    }


}