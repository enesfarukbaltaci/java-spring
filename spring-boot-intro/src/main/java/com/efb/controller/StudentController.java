package com.efb.controller;


import com.efb.domain.Student;
import com.efb.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    private IStudentService studentService;

    @GetMapping("/welcome")
    @ResponseBody
    public String welcome(){
        return "Welcome to Student Controller";
    }



}
