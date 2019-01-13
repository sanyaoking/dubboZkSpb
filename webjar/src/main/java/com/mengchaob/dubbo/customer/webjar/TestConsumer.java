package com.mengchaob.dubbo.customer.webjar;

import com.mengchaob.dubbo.producer.service.CommonApi;
import com.mengchaob.dubbo.producer.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: mengchao
 * @Date: 2019-1-8 21:10
 * @Description:
 * @Version 1.0
 * @ClassName TestConsumer
 */
@Controller
@RequestMapping(value = "/Controller")
public class TestConsumer {
    @Autowired
    CommonApi commonApi;
    @GetMapping(value ="/TestConsumer/{name}" )
    public @ResponseBody
    String TestConsumer(@PathVariable("name")String name){
        User u = commonApi.getUser(name);
        System.out.println(u.toString());
        return  u.toString();
    }
}
