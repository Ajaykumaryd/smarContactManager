package com.SmartCardContactManager.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="CONTACT")
@Data
public class Contact {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private String secondName;
    private String work;
    private String email;
    private String phone;
    private String image;


    @ManyToOne
    private User user;


}
