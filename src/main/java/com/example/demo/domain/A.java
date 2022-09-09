package com.example.demo.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author guocz
 * @date 2022/9/2 15:46
 */
@Data
public class A {

    @Value("我是AAA")
    private String name;

}
