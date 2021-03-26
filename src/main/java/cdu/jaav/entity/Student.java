package cdu.jaav.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2021-03-25 08:21:21
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -23685457396781411L;
    /**
     * id
     */
    private Integer sid;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 1:拒绝访问，2：正常访问
     */
    private Integer status;
    /**
     * 名字
     */
    private String name;
    /**
     * 违规次数
     */
    private Integer flag;
    /**
     * 第一次违规时间
     */
    private Date time;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", pwd='" + pwd + '\'' +
                ", status=" + status +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                ", time=" + time +
                '}';
    }
}