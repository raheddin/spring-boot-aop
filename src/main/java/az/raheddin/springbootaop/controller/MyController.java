package az.raheddin.springbootaop.controller;

import az.raheddin.springbootaop.entity.User;
import az.raheddin.springbootaop.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @PostMapping("/param")
    public void msj(@RequestParam String msj){
        System.out.println("Start:"+msj);
        myService.myMsj(msj);
    }

    @PostMapping("/body")
    public void msjBody(@RequestBody User msj){
        System.out.println("Start:"+msj);
        myService.myMsjBody(msj);
    }


}
