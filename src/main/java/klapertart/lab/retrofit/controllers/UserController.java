package klapertart.lab.retrofit.controllers;

import klapertart.lab.retrofit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRITRONIK-PC_10040
 * @since 20/03/2023
 */

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/user/{name}"
    )
    public String getUser(@PathVariable String name){
        return userService.getUser(name);
    }
}
