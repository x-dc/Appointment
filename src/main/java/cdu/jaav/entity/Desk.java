package cdu.jaav.entity;

import java.io.Serializable;

/**
 * (Desk)实体类
 *
 * @author makejava
 * @since 2021-03-25 08:14:38
 */
public class Desk implements Serializable {
    private static final long serialVersionUID = -65426165679765332L;
    /**
     * 座位id
     */
    private Integer did;
    /**
     * 阅览室id
     */
    private Integer hid;
    /**
     * 0,空闲  1，使用中
     */
    private Integer status;


    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "did=" + did +
                ", hid=" + hid +
                ", status=" + status +
                '}';
    }
}