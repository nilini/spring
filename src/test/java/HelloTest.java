import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class HelloTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        Date date = (Date) context.getBean("date");
        helloWorld.helloWorld();
        helloWorld.helloWorld2();
        helloWorld.helloWorldByChinese();
        System.out.println(date.getTime());

    }
}
