package edu.dio.lesson9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application.xml", "car.xml", "supercar.xml"});

        Person person1 = applicationContext.getBean("person", Person.class);
        Person person2 = applicationContext.getBean("person2", Person.class);

        System.out.println(person1);
        System.out.println(person2);
    }
}
