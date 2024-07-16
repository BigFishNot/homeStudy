package com.yudaxian.springbootknife4j.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Knife4j测试")
@RestController
@RequestMapping("/knife")
public class Knife4jController {

    @ApiOperation("测试Knife4j")
    @PostMapping("/test")
    public String test() {
        return "yudaxian";
    }

}
