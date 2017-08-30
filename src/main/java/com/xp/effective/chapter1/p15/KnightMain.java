package com.xp.effective.chapter1.p15;

import com.xp.effective.chapter1.p12.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xp
 * @time 2017/8/23
 */
public class KnightMain {

//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
//        Knight knight = context.getBean(Knight.class);
//        knight.embarkOnQuest();
//        context.close();
//    }

//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.xp.effective.chapter1.p15");
//        Knight knight = context.getBean(Knight.class);
//        knight.embarkOnQuest();
//    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c1/knights-aop.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
