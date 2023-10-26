package com.example.personaldemooffice.homePage.signIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// this is class doing actions and create action method here!
// this is class connected with rootService
@Service
public class SignInService implements SignInRootService {

    @Autowired
    private final SignInRepository signInRepository;

    public SignInService (SignInRepository signInRepository) {
        this.signInRepository = signInRepository;
    }

//    this is method for save notes to base
    @Override
    public void saveSignInUserToBase(String username, String password) {
        SignInTable signInTable = new SignInTable();
        signInTable.setUsername(username);
        signInTable.setPassword(password);

        signInRepository.save(signInTable);
    }

}
