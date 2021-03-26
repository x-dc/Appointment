package cdu.jaav.entity;

import java.io.Serializable;

/**
 * (Note)实体类
 *
 * @author makejava
 * @since 2021-03-25 17:27:37
 */
public class Note implements Serializable {
    private static final long serialVersionUID = 321539038672737910L;
    /**
     * 公告id
     */
    private Integer nid;
    /**
     * 标题
     */
    private String title;
    /**
     * 管理员id
     */
    private Integer mid;
    /**
     * 发布时间
     */
    private Integer time;


    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

}