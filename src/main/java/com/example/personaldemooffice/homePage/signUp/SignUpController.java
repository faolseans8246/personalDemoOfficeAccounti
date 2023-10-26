package com.example.personaldemooffice.homePage.signUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sign_up")
public class SignUpController {

    @Autowired
    private final SignUpRootService signUpRootService;

    public SignUpController (SignUpRootService signUpRootService) {
        this.signUpRootService = signUpRootService;
    }

    @GetMapping("/goToSignInPage")
    public String goToHomePage() {
        return "/homePage";
    }

    @PostMapping("/saveSignUpNotes")
    public String saveNotesSignUpBase(
            @RequestParam (value = "signUp_username") String signUpUsername,
            @RequestParam (value = "signUp_email") String signUpEmail,
            @RequestParam (value = "signUp_password") String signUpPassword,
            @RequestParam (value = "signUp_confirm_password") String signUpConfirmPassword
    ) {
        signUpRootService.saveSignUpUsersToBase(signUpUsername, signUpEmail, signUpPassword, signUpConfirmPassword);
        return "redirect:/";
    }
}
