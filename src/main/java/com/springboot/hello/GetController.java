package com.springboot.hello;

import org.slf4j.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetController {

    private final Logger LOGGER = LoggerFactory.getLogger(GetController.class);

    @GetMapping("/hello")
    public String getHello() {
        LOGGER.info("getHello 메서드가 호출되었습니다.");
        return "Hello World";
    }

    @GetMapping("/name")
    public String getName() {
        LOGGER.info("getName 메서드가 호출되었습니다.");
        return "Flature";
    }

    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        LOGGER.info("@PathVariable을 통해 들어온 값 : {}", variable);
        return variable;
    }

    @GetMapping("/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    @Operation(summary = "GET 메서드 예제", description = "@RequestParam을 활용한 GET Method")
    @GetMapping("/request1")
    public String getRequestParam1(
            @Schema(description = "이름", required = true, example = "홍길동")@RequestParam String name,
            @Schema(description = "이메일", required = true, example = "example@gmail.com")@RequestParam String email,
            @Schema(description = "회사", required = true, example = "samsung")@RequestParam String organization
    ) {
        return name + " " + email + " " + organization;
    }

    @GetMapping("/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuffer sb = new StringBuffer();
        param.entrySet().forEach(map ->
                sb.append(map.getKey() + " : " + map.getValue() + "\n"));
        return sb.toString();
    }

    @GetMapping("/request3")
    public String getRequestParam3(MemberDto memberDto) {
        return memberDto.toString();
    }
}
