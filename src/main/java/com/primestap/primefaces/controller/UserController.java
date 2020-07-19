package com.primestap.primefaces.controller;


import com.primestap.primefaces.model.ConfirmationToken;

import com.primestap.primefaces.model.User;
import com.primestap.primefaces.service.ConfirmationTokenService;
import com.primestap.primefaces.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class UserController {
/*
    private  UserService userService;

    private ConfirmationTokenService confirmationTokenService;



    @PostMapping("/sign-up")
    String signUp(@Valid @RequestBody User user) {
        UserService.signUpUser(user);
        return "sign-in";
    }

    @PostMapping("/sign-in")
    String signIn(User user) {

        UserService.signUpUser(user);

        return "redirect:/sign-in";
    }

    @GetMapping("/confirm")
    String confirmMail(@RequestParam("token") String token) {

        Optional<ConfirmationToken> optionalConfirmationToken = confirmationTokenService.findConfirmationTokenByToken(token);

        optionalConfirmationToken.ifPresent(UserService::confirmUser);

        return "/sign-in";
    }
*/
}
