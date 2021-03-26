package cdu.jaav.entity;

import java.io.Serializable;

/**
 * (Room)实体类
 *
 * @author makejava
 * @since 2021-03-25 08:14:04
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 436898272509089140L;
    /**
     * 阅览室id
     */
    private Integer hid;
    /**
     * 位置
     */
    private String location;
    /**
     * 阅览室名字
     */
    private String name;
    /**
     * 0：空闲 1：满
     */
    private Integer status;
    /**
     * 总的位置数量
     */
    private Integer allnum;
    /**
     * 空闲座位数
     */
    private Integer num;


    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAllnum() {
        return allnum;
    }

    public void setAllnum(Integer allnum) {
        this.allnum = allnum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Room{" +
                "hid=" + hid +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", allnum=" + allnum +
                ", num=" + num +
                '}';
    }
}