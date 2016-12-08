package com.company;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xtml");

        Object obj = context.getBean("t1000");

        if(obj instanceof ModelT1000){
            ModelT1000 t1000 = (ModelT1000) obj;
            t1000.dance();
        }


    }
}
