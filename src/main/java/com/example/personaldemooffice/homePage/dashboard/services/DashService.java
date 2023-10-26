package com.example.personaldemooffice.homePage.dashboard.services;


import com.example.personaldemooffice.homePage.dashboard.repositories.DashRepositories;
import com.example.personaldemooffice.homePage.signUp.SignUpTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class DashService implements DashRootService {

    @Autowired
    private final DashRepositories dashRepositories;

    public DashService (DashRepositories dashRepositories) {
        this.dashRepositories = dashRepositories;
    }

    @Override
    public List<SignUpTable> getNotes() {
        return dashRepositories.findAll();
    }

}
