package com.example.common.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: demo
 * @Package: com.example.common
 * @ClassName: CommonController
 * @Author: caihongyu
 * @Description:
 * @Date: 2021/1/16 10:05 上午
 * @Version: 1.0
 */
@Slf4j
@RequestMapping("/docker")
@RestController
public class CommonController {

    @RequestMapping("/test")
    public Map test(){
        log.info("docker测试");
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("200","成功");
        return map;
    }
}
