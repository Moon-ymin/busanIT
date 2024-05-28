package com.busanit.spring_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 일반 MVC 컨트롤러
// Controller : 웹 요청을 처리하고 그 결과를 뷰에 전달하는 스프링 빈 객체
@Controller
public class GreetingController {

    @GetMapping("/hi")  // HTTP 요청(GET) : 메서드가 처리할 요청 경로 지정,
    public String niceToMeetYou(Model model) {  // /hi 경로로 들어온 요청을 niceToMeetYou() 메서드를 이용해서 처리한다고 설정
        model.addAttribute("message", "점심시간입니다~");  // Model 에 데이터를 반영
        return "greetings";                                                         // View 로 전달
    }
}
