package com.example.personaldemooffice.homePage.signUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService implements SignUpRootService {

    @Autowired
    private final SignUpRepository signUpRepository;

    public SignUpService (SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

//    Save notes to sign up of Base
    @Override
    public void saveSignUpUsersToBase(String usernameUp, String emailUp, String passwordUp, String confirm_passwordUp) {
        SignUpTable signUpTable = new SignUpTable();
        signUpTable.setUsernameUp(usernameUp);
        signUpTable.setEmailUp(emailUp);
        signUpTable.setPasswordUp(passwordUp);
        signUpTable.setConfirm_passwordUp(confirm_passwordUp);

        this.signUpRepository.save(signUpTable);
    }
}
