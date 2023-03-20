package klapertart.lab.retrofit.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author TRITRONIK-PC_10040
 * @since 20/03/2023
 */

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers(){
        userService.getAllUsers();
    }

    @Test
    public void testGetUser(){
        userService.getUser();
    }
}
