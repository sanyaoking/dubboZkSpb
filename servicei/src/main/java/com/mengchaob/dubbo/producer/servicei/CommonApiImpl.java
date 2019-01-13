package com.mengchaob.dubbo.producer.servicei;

import com.mengchaob.dubbo.producer.service.CommonApi;
import com.mengchaob.dubbo.producer.service.User;

/**
 * @Auther: mengchao
 * @Date: 2019-1-6 19:46
 * @Description:
 * @Version 1.0
 * @ClassName CommonApiImpl
 */
public class CommonApiImpl implements CommonApi {

    @Override
    public User getUser(String name) {
        User user = new User();
        user.setAge("11");
        user.setEmail("123456@qq.com");
        user.setId(1+"");
        user.setName(name);
        return user;
    }
}
