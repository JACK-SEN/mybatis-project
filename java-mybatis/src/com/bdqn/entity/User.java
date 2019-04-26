package com.bdqn.entity;/**
 * @Auther: HelloWorld
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: workspace-idea-boot
 * @description: 用户实体类
 * @author: lth
 * @create: 2019-04-26 08:39
 **/
public class User {

    private Integer eid;
    private String name;
    private String job;
    private Integer salary;
    private Date createtime;
    private Integer departId;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public User() {
    }

    public User(Integer eid, String name, String job, Integer salary, Date createtime, Integer departId) {
        this.eid = eid;
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.createtime = createtime;
        this.departId = departId;
    }

    public User(Integer eid, String name, String job, Integer salary, Integer departId) {
        this.eid = eid;
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.departId = departId;
    }

    @Override
    public String toString() {
        return "User{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", createtime=" + createtime +
                ", departId=" + departId +
                '}';
    }
}
