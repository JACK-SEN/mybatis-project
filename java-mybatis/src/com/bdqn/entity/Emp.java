package com.bdqn.entity;/**
 * @Auther: HelloWorld
 */

import java.util.Date;

/**
 * @program: java-mybatis
 * @description: 员工表
 * @author: lth
 * @create: 2019-04-26 13:40
 **/
public class Emp {
    /**员工ID*/
    private Integer id;
    /**员工编号*/
    private String empId;
    /**员工账号*/
    private String username;
    /**员工真是姓名*/
    private String realName;
    /**员工性别*/
    private String sex;
    /**员工账号密码*/
    private String password;
    /**员工邮箱*/
    private String email;
    /**员工生日*/
    private Date birthday;
    /**员工电话*/
    private String phone;
    /**员工地址*/
    private String address;
    /**员工入职时间*/
    private Date jobTime;
    /**员工所属部门*/
    private String departId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public Date getJobTime() {
        return jobTime;
    }

    public void setJobTime(Date jobTime) {
        this.jobTime = jobTime;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public Emp() {
    }

    public Emp(Integer id, String empId, String username, String realName, String sex, String password, String email, Date birthday, String phone, String address, Date jobTime, String departId) {
        this.id = id;
        this.empId = empId;
        this.username = username;
        this.realName = realName;
        this.sex = sex;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.jobTime = jobTime;
        this.departId = departId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empId='" + empId + '\'' +
                ", username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", jobTime=" + jobTime +
                ", departId='" + departId + '\'' +
                '}';
    }
}
