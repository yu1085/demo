package com.example.user.controller;

import com.example.common.controller.CommonController;
import com.example.common.service.CommonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: demo
 * @Package: com.example.user
 * @ClassName: UserController
 * @Author: caihongyu
 * @Description:
 * @Date: 2021/1/16 10:10 上午
 * @Version: 1.0
 */
@Slf4j
@RequestMapping("/docker")
@RestController
public class UserController {

    @RequestMapping("/test")
    public Map test(){
        log.info("docker测试1111");
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("20000000","成功");
        CommonService commonService = new CommonService();
        commonService.test();
        return map;
    }
}

