package az.raheddin.springbootaop.controller;

import az.raheddin.springbootaop.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @PostMapping
    public void msj(@RequestParam String msj){
        System.out.println("Start:"+msj);
        myService.myMsj(msj);
    }


}
