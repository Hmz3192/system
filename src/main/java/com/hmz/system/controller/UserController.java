package com.hmz.system.controller;

import com.google.code.kaptcha.Constants;
import com.hmz.system.model.User;
import com.hmz.system.service.UserService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/6/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping(value = "/Login.do", method = RequestMethod.POST)
    public String Login(HttpServletRequest request, User user) {

        String username = user.getUsername();
//        String username=request.getParameter("username");
        boolean a = userService.selectUser(username);
        if (a) {
            return "all";
        } else {
            System.out.print("账户密码输入错误");
            return "/Login.jsp";
        }
    }
}
