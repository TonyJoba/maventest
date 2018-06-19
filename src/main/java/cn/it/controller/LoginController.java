package cn.it.controller;

import cn.it.model.ORG;
import cn.it.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    protected static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        ORG org = this.userService.getOrg();
        System.out.println(org.getName());
        logger.debug("登录成功");
        return "login.html";
    }
}
