package com.pc.origin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * ClassName
 * </p>
 *
 * @since 2024/3/13
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test.json")
    public String test(){
        return "success";
    }
}
