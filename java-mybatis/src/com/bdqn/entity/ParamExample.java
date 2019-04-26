package com.bdqn.entity;/**
 * @Auther: HelloWorld
 */

import java.util.List;

/**
 * @program: java-mybatis
 * @description: 参数 封装
 * @author: lth
 * @create: 2019-04-26 16:25
 **/
public class ParamExample {
    private List ids;

    public List getIds() {
        return ids;
    }

    public void setIds(List ids) {
        this.ids = ids;
    }

    public ParamExample(List ids) {
        this.ids = ids;
    }

    public ParamExample() {
    }
}
