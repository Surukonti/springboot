package com.springboot.main.service;

import com.springboot.main.controller.MainController;
import com.springboot.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    MainController mainController;

  //  public List<UserBO> persistService
}
