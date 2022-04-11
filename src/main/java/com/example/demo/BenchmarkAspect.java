package com.example.demo;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class BenchmarkAspect {


 /*   @Before("@annotation(Benchmark)")
    public void doBeforeBenchmarkAnnotation() {
        System.out.println(System.nanoTime());
    }*/


    @SneakyThrows
    @Around("@annotation(Benchmark)")
    public Object doAroundBenchmarkAnnotatedMethods(ProceedingJoinPoint pjp){

        System.out.println("******** benchmark for method "+pjp.getSignature().getName()+" started. ************");
        long start = System.nanoTime();
        Object retVal = pjp.proceed();
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println("******** benchmark for method "+pjp.getSignature().getName()+" ended. ************");
        return retVal;
    }

}
