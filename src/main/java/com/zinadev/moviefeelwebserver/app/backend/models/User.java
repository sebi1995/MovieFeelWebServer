package com.zinadev.moviefeelwebserver.app.backend.models;

import lombok.Data;

//import javax.persistence.*;

@Data
//@Entity
public class User {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer uid;

    //    @Column
    private String title;

    //    @Column
    private String firstname;

    //    @Column
    private String surname;

    //    @Column(name = "email_address")
    private String emailAddress;

    //    @Column
    private String password;

    //    @Column(name = "person_type")
    private String personType;

    public User() {

    }

    public User(Integer uid, String title, String firstname, String surname, String email, String password, String personType) {
        this.uid = uid;
        this.title = title;
        this.firstname = firstname;
        this.surname = surname;
        this.emailAddress = email;
        this.password = password;
        this.personType = personType;
    }

}
