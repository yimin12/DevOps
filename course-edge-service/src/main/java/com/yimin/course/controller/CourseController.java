package com.yimin.course.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yimin.course.dto.CourseDTO;
import com.yimin.course.service.ICourseService;
import com.yimin.thrift.user.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
 *   @Author : Yimin Huang
 *   @Contact : hymlaucs@gmail.com
 *   @Date : 2021/2/7 20:28
 *   @Description :
 *
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    @Reference
    private ICourseService courseService;

    @RequestMapping(value="/courseList", method= RequestMethod.GET)
    @ResponseBody
    public List<CourseDTO> courseList(HttpServletRequest request){
        UserDTO user = (UserDTO) request.getAttribute("user");
        System.out.println(user.toString());
        return courseService.courseList();
    }
}
