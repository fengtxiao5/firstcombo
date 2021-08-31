package com.firstcombo.controller.user;

import com.firstcombo.login.loginclient.domain.Result;
import com.firstcombo.login.loginclient.domain.request.UserReqDTO;
import com.firstcombo.login.loginclient.domain.response.UserRespDTO;
import com.firstcombo.login.loginclient.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Description
 * @Author ftx
 * @Date 2021/8/24 16:21
 * @Version 1.0
 **/
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/show")
    public Result<UserRespDTO> show(){
        UserReqDTO reqDTO = new UserReqDTO();
        reqDTO.setId("1");
        reqDTO.setUsername("aaa");
        return userService.show(reqDTO);
    }
}
