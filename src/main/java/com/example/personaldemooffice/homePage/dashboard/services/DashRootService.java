package com.example.personaldemooffice.homePage.dashboard.services;

import com.example.personaldemooffice.homePage.signUp.SignUpTable;
import org.springframework.ui.Model;

import java.util.List;

public interface DashRootService {

    public List<SignUpTable> getNotes();
}
