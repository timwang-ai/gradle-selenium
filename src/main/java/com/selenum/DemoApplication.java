package com.selenum;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Project : gradle-selenium
 * @ FileName : DemoApplication
 * @ DateTime : 2021/3/10 11:29
 * @ AuthorName : Tim Kevin
 */
@SpringBootApplication
@RestController
@Slf4j
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/Hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        log.info("执行成功");
        return String.format("Hello %s", name);
    }

}
