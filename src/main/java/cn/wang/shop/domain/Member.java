package cn.wang.shop.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: MyBatisMShop
 * @description:
 * @Package: cn.wang.shop.domain
 * @ClassName: Member
 * @author: wang
 * @create: 2021/04/08 00:00
 * @Version: 1.0
 */
public class Member implements Serializable {
    private String mid;
    private String password;
    private String name;
    private String phone;
    private String address;
    private String code;
    private Date regdate;
    private String photo;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mid='" + mid + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                ", regdate=" + regdate +
                ", photo='" + photo + '\'' +
                '}';
    }
}
