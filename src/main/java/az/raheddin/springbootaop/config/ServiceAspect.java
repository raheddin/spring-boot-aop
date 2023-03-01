package az.raheddin.springbootaop.config;

import az.raheddin.springbootaop.entity.User;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdviceAdapter;

import java.io.IOException;
import java.lang.reflect.Type;

@Aspect
@Component
public class ServiceAspect extends RequestBodyAdviceAdapter {
    @Override
    public boolean supports(MethodParameter methodParameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        System.out.println("supports");
        return false;
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) throws IOException {
        System.out.println("beforeBodyRead");
        return null;
    }

    @Override
    public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        System.out.println("afterBodyRead");
        return null;
    }

    @Override
    public Object handleEmptyBody(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        System.out.println("handleEmptyBody");
        return null;
    }

    /* @Before("execution(* az.raheddin.springbootaop.service.MyService.myMsj(..))")
    public void msjSerBefore(JoinPoint joinPoint){
        System.out.println("Before msj:"+joinPoint.getArgs()[0]);
    }

    @After("execution(* az.raheddin.springbootaop.service.*.*(..))")
    public void msjSerAfter(){
        System.out.println("After msj:");
    }

    @Before("execution(* az.raheddin.springbootaop.service.MyService.myMsjBody(..))")
    public void msjBodySerBefore(JoinPoint joinPoint){
        System.out.println("Before msj:"+joinPoint.getArgs()[0]);
    }*/
}
