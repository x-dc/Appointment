package cdu.jaav.entity;

import java.io.Serializable;

/**
 * (Manger)实体类
 *
 * @author makejava
 * @since 2021-03-25 08:14:31
 */
public class Manger implements Serializable {
    private static final long serialVersionUID = -49103974079401890L;
    /**
     * 管理员id
     */
    private Integer mid;
    /**
     * 管理员name
     */
    private String name;
    /**
     * 管理员权限
     */
    private Integer power;
    /**
     * 管理员联系电话
     */
    private Integer tel;


    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Manger{" +
                "mid=" + mid +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", tel=" + tel +
                '}';
    }
}