package com.wen.controller;


import com.wen.entity.User;
import com.wen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author young
 * @since 2023-06-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public String test(){
        User user = userService.getById(1L);
        System.out.println("user"+user.toString());
        return user.toString();
    }
}

