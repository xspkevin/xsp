package com.xsp.amazon.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * @description: <br>
     * @param: []
     * @return: java.lang.String
     * @author: Xu Shengping
     * @date: 2021/4/20
     */
    @RequestMapping("/")
    public String index() {
        return "appKey: " + appKey + "<br/>" + "appSecret: " + appSecret;
    }

}
