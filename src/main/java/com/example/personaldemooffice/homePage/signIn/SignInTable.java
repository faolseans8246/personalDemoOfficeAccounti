package com.example.personaldemooffice.homePage.signIn;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "sign_in")
public class SignInTable implements Serializable {

    //  id in table of sign in
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "signIn ID")
    private long id;

    //    email in table of sign in
    @Column(name = "signIn email")
    private String username;

    //    password in table of sign in
    @Column(name = "signIn password")
    private String password;

    //  it is empty constructor for parametrs of table
    public SignInTable() {
    }

    //  it is full constructor for parametrs of table
    public SignInTable(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

//    this is methos that notes connect to base parametrs


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
