package com.example.personaldemooffice.homePage.signIn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


//This class for control web page part of sign in
@Controller
//@RestController("/")
public class SignInController {

    @Autowired
    private final SignInRootService signInRootService;

    public SignInController (SignInRootService signInRootService) {
        this.signInRootService = signInRootService;
    }


//    This is method do to open home page on browser
    @GetMapping("/")
    public String openHome() {
        return "/homePage";
    }

//    go back to home page
    @PostMapping("/saveSignInToBase")
    public String saveSignInBaseNote(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        signInRootService.saveSignInUserToBase(username, password);
        return "/dashboard/mainDashboard";
    }

//    pass to signUp page
    @GetMapping("/passSignUpPage")
    public String passSignUpPage() {
        return "/signUp/signUpPage";
    }

}
