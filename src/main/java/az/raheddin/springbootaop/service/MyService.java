package az.raheddin.springbootaop.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void myMsj(String msj){
        System.out.println("MY MESSAGE:"+msj);
    }
}
