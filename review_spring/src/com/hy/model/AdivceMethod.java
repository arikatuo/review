package com.hy.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 2017/8/1.
 */
@Component
@Aspect
public class AdivceMethod {


    @Before("execution(* com.hy.model.BabyPerson.*(..))")
    public void beforeEat() {
        System.out.println("-------------------吃饭之前先洗小手！--------------------");
    }

    @After("execution(* com.hy.model.BabyPerson.eatLunch(..))")
    public void afterEat() {
        System.out.println("-------------------午饭吃完要睡午觉！--------------------");
    }

    @Around("execution(* com.hy.model.BabyPerson.eatSupper(..))")
    public Object aroundEat(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("-------------------吃晚饭前先玩一玩！-------------------");
        Object retVal = pjp.proceed();
        System.out.println("-------------------晚饭吃完后要得睡觉了！-------------------");
        return retVal;
    }
}
