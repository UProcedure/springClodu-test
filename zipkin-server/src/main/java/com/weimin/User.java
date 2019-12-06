package com.weimin;

/**
 * @author weimin
 * @ClassName User
 * @Description TODO
 * @date 2019/12/6 9:44
 */
public class User {
    private String sex;

    public User(String sex) {
        this.sex = sex;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "sex='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
