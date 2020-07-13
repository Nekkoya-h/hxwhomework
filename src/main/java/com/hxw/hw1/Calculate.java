package com.hxw.hw1;

import com.hxw.hw1.aop.CountImpl;
import com.hxw.hw1.aop.ICount;
import com.hxw.hw1.entity.Number;
import com.hxw.hw1.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calculate {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Number n = (Number)ac.getBean(Number.class);
        Student s = (Student)ac.getBean(Student.class);
        s.setNum(n);
        System.out.println(s);
        ApplicationContext ac2 = new ClassPathXmlApplicationContext("bean_aop.xml");
        ICount count = (ICount) ac2.getBean("countImpl");
        System.out.println(count.getClass().getName());

        float result1 = count.add(s.getNum().getA(),s.getNum().getB());
        System.out.println(result1);

        float result2 = count.mul(s.getNum().getA(),s.getNum().getB());
        System.out.println(result2);
    }

}
