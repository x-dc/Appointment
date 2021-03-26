package cdu.jaav.controller;

import cdu.jaav.entity.Note;
import cdu.jaav.service.NoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Note)表控制层
 *
 * @author makejava
 * @since 2021-03-25 17:27:37
 */
@RestController
@RequestMapping("note")
public class NoteController {
    /**
     * 服务对象
     */
    @Resource
    private NoteService noteService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Note selectOne(Integer id) {
        return this.noteService.queryById(id);
    }

}