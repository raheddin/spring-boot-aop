package az.raheddin.springbootaop.service;

import az.raheddin.springbootaop.entity.User;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void myMsj(String msj){
        System.out.println("MY MESSAGE:"+msj);
    }

    public void myMsjBody(User user){
        System.out.println("MY MESSAGE:"+user);
    }
}
