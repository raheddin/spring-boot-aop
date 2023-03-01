package az.raheddin.springbootaop.controller;

import az.raheddin.springbootaop.entity.User;
import az.raheddin.springbootaop.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aop")
public class MyController {

    private final MyService myService;

    //not work
    @PostMapping("/param")
    public void msj(@RequestParam String msj) {
        System.out.println("Start:" + msj);
        myService.myMsj(msj);
    }

    //not work
    @PostMapping("/body")
    public void msjBody(@RequestBody User msj) {
        System.out.println("Start:" + msj);
        myService.myMsjBody(msj);
    }

    //work
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/hello"
    )
    public ResponseEntity<?> getHello(
            @RequestParam("name") String username
    ) {
        return ResponseEntity.ok("Hello, " + username);
    }


}
