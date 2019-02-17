package com.springboot.main.controller;

import com.springboot.main.model.User;
import com.springboot.main.repository.UserRepository;
import com.springboot.main.service.MainService;
import com.springboot.main.service.UserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Get")
public class MainController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    MainService mainService;

    @GetMapping(value = "/Persons")
    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    //@GetMapping(value = "/id")


   // @PostMapping(value = "/post")
  //  public List<User> persist(@RequestBody final UserBO userBO)
   // {
   //     userRepository.save(userBO);
    //    return userRepository.findAll();

   // }

}
