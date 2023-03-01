package az.raheddin.springbootaop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* az.raheddin.springbootaop.service.*.*(..))")
    public void msjSerBefore(JoinPoint joinPoint){
        System.out.println(joinPoint.getArgs()[0]);
       // System.out.println(joinPoint.getArgs()[1]); //java.lang.ArrayIndexOutOfBoundsException
        System.out.println("Before msj:");
    }

    @After("execution(* az.raheddin.springbootaop.service.*.*(..))")
    public void msjSerAfter(){
        System.out.println("After msj:");
    }
}
