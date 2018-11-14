package com.em.eddieweb.domain;

import javax.persistence.Table;

/**
 * Student class
 *
 * @author Administrator
 * @date
 */
@Table(name="student")
public class Student extends BaseEntity {
    private String name;
    private int gender;
    private int  age;
    private String phone;
    private String address;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

}
