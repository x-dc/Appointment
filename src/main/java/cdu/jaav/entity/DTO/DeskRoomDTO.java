package cdu.jaav.entity.DTO;

public class DeskRoomDTO {
    /**
     * 座位id
     */
    private Integer did;
    /**
     * 0,空闲  1，使用中
     */
    private Integer status;
    /**
     * 位置
     */
    private String location;
    /**
     * 阅览室名字
     */
    private String name;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "DeskRoomDTO{" +
                "did=" + did +
                ", status=" + status +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
