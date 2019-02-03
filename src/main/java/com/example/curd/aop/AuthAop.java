package com.example.curd.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
@Aspect
public class AuthAop {
    @Pointcut("execution(public * com.example.curd.web..*.*(..))")
    private void auth(){}

    @Before("auth()")
    public void afterAuth() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String logininfo = request.getHeader("logininfo");

    }
}
