package com.example.webdubbo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/31
 * @desc
 */
@ApiModel(description = "用户信息实体")
public class User {
    @ApiModelProperty(value = "用户ID",required=true)
    private int id;
    @ApiModelProperty(value = "用户姓名",required=true)
    private String username;
    @ApiModelProperty(value = "用户年龄",required=false)

    private int age;
    @ApiModelProperty(value = "用户入职日期",required=true)
    private Date ctm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", ctm=" + ctm +
                '}';
    }
}
