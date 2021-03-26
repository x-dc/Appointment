package cdu.jaav.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2021-03-25 08:14:18
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -17361930394850573L;
    /**
     * 学生id
     */
    private Integer sid;
    /**
     * 预约信息id
     */
    private Integer oid;
    /**
     * 预约开始时间
     */
    private Date starttime;
    /**
     * 预约结束时间
     */
    private Date endtime;
    /**
     * 座位id
     */
    private Integer did;
    /**
     * 1，正常  2，违规
     */
    private Integer flag;
    /**
     * 1.未签到 2.已签到 3.签离
     */
    private Integer status;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sid=" + sid +
                ", oid=" + oid +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", did=" + did +
                ", flag=" + flag +
                ", status=" + status +
                '}';
    }
}