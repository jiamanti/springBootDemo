package com.jmt.demo;


import cn.hutool.core.util.StrUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan(basePackages = {"com.jmt.demo.mapper"})
@SpringBootApplication
public class SpringBootDemoApplication {

	/**
	 * Hello，World
	 *
	 * @param who 参数，非必须
	 * @return Hello, ${who}
	 */
	@GetMapping("/hello")
	public String sayHello(@RequestParam(required = false, name = "who") String who) {
		if (StrUtil.isBlank(who)) {
			who = "World";
		}
		return StrUtil.format("Hello, {}!", who);
	}

	/**
	 * Hello，World
	 *
	 * @param who 参数，非必须
	 * @return Hello, ${who}
	 */
	@GetMapping("/hello1")
	public String sayHello1(@RequestParam(required = false, name = "who") String who) {
		if (StringUtils.isEmpty(who)) {
			who = "World";
		}
		return "Hello, {"+who+"}!";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
