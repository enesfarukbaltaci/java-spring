package com.efb.controller;

import com.efb.domain.Student;
import com.efb.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {


    @Autowired
    private IStudentService studentService;

    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome(){
        return "Welcome to Student Controller";
    }

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public ModelAndView getStudents(){
        ModelAndView mav = new ModelAndView();
//        List<Student> list = studentService.getAll();
        mav.addObject("students",studentService.getAll());
        mav.setViewName("students");
        return mav;
    }

}
