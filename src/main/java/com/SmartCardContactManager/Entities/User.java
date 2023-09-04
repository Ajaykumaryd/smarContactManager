package com.SmartCardContactManager.Entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name="USER")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
    private boolean enabled;
    private String imageUrl;
    @Column(length = 500)
    private String about;



    @OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
    private List<Contact> Contact=new ArrayList<>();







}
