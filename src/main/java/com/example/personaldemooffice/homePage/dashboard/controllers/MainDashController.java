package com.example.personaldemooffice.homePage.dashboard.controllers;

import com.example.personaldemooffice.homePage.dashboard.services.DashRootService;
import com.example.personaldemooffice.homePage.signUp.SignUpTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Dashboard")
public class MainDashController {

    @Autowired
    private final DashRootService dashRootService;

    public MainDashController (DashRootService dashRootService) {
        this.dashRootService = dashRootService;
    }

    @GetMapping("/userTables")
    public String getSite(Model model) {
        List<SignUpTable> getNotes = dashRootService.getNotes();
        model.addAttribute("notes", getNotes);

        return "/dashboard/mainDashboard";
    }

}
