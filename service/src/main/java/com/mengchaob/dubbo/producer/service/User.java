package com.mengchaob.dubbo.producer.service;

import java.io.Serializable;

/**
 * @Auther: mengchao
 * @Date: 2019-1-6 19:44
 * @Description:
 * @Version 1.0
 * @ClassName User
 */
public class User implements Serializable {
    private String name;
    private String id;
    private String age;
    private String email;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
