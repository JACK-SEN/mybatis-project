package com.bdqn.entity;/**
 * @Auther: HelloWorld
 */

/**
 * @program: java-mybatis
 * @description: 部门实体类
 * @author: lth
 * @create: 2019-04-26 11:17
 **/
public class Department {
    private Integer did;
    private String name;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department() {
    }

    public Department(Integer did, String name) {
        this.did = did;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", name='" + name + '\'' +
                '}';
    }
}
