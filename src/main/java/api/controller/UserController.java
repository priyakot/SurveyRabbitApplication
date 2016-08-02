package api.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.user.User;
/**
 * This is a rest controller to get user details. 
 * We can also add more functionality for Users in this controller
 * @author pkotwal
 *
 */
@RestController
public class UserController {

    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping("/api/get_user")
    public User response(@RequestParam(value="name", defaultValue="testUser") String name) {
        return new User(counter.incrementAndGet(),
                             "Priya", "admin");
    }

}
