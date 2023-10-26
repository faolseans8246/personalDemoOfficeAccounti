package com.example.personaldemooffice.homePage.signUp;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "sign_up_user")
public class SignUpTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sign_Up ID")
    private long id;

    @Column(name = "Sign_Up username")
    private String usernameUp;

    @Column(name = "Sign_Up email")
    private String emailUp;

    @Column(name = "Sign_Up password")
    private String passwordUp;

    @Column(name = "Sign_up confirm_password")
    private String confirm_passwordUp;

    public SignUpTable() {
    }

    public SignUpTable(long id, String usernameUp, String emailUp, String passwordUp, String confirm_passwordUp) {
        this.id = id;
        this.usernameUp = usernameUp;
        this.emailUp = emailUp;
        this.passwordUp = passwordUp;
        this.confirm_passwordUp = confirm_passwordUp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsernameUp() {
        return usernameUp;
    }

    public void setUsernameUp(String usernameUp) {
        this.usernameUp = usernameUp;
    }

    public String getEmailUp() {
        return emailUp;
    }

    public void setEmailUp(String emailUp) {
        this.emailUp = emailUp;
    }

    public String getPasswordUp() {
        return passwordUp;
    }

    public void setPasswordUp(String passwordUp) {
        this.passwordUp = passwordUp;
    }

    public String getConfirm_passwordUp() {
        return confirm_passwordUp;
    }

    public void setConfirm_passwordUp(String confirm_passwordUp) {
        this.confirm_passwordUp = confirm_passwordUp;
    }
}
