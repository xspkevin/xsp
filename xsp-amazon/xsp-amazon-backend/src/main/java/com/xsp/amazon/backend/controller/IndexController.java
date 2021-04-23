package com.xsp.amazon.backend.controller;

import com.xsp.amazon.backend.domain.User;
import com.xsp.amazon.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author: Xu Shengping
 * @date: 2021/4/20
 */
@RestController
public class IndexController {

    @Value("${appKey}")
    private String appKey;

    @Value("${appSecret}")
    private String appSecret;

    @Autowired
    private UserService userService;


    /**
     * @description: <br>
     * @param: []
     * @return: java.lang.String
     * @author: Xu Shengping
     * @date: 2021/4/20
     */
    @RequestMapping("/")
    public String index() throws IOException  {
        /*
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession(true);
        UserMapper userMapper = session.getMapper(UserMapper.class);

        List<User> users = userMapper.findAll();
        for (User user: users) {
            System.out.println(user);
        }
        session.close();
        inputStream.close();
        */

        List<User> users = userService.findAll();
        System.out.println(users);

        return "appKey: " + appKey + "<br/>" + "appSecret: " + appSecret;
    }

}
