import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class fieldRetrievingFactory {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("fieldRetrivingFactory.xml");
        System.out.println("系统获取 theage1的值, " + context.getBean("theAge1"));
        System.out.println("系统获取 theage2的值, " + context.getBean("theAge2"));
        System.out.println("Son " + context.getBean("son"));
    }
}
