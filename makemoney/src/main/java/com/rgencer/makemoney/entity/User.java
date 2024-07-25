package com.rgencer.makemoney.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    private  String userId;
    @Column(name = "user_name")
    private  String userName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name ="email")
    private String email;
    @Column(name = "password")
    private String password;





}
