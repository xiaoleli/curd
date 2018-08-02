package com.example.curd.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sys_User")
@Data
public class UserEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String loginName;
    private String passWord;
    private String userAge;
}
