import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;
import java.util.Locale;

public class HelloTest {
    public static void main(String[] args) {
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.helloWorld();
        helloWorld.helloWorld2();
        helloWorld.helloWorldByChinese();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("messagebeans.xml");
        String hello = context.getMessage("hello", new String[]{"孙悟空"}, Locale.getDefault(Locale.Category.FORMAT));
        String now = context.getMessage("now", new Object[]{new Date()}, Locale.getDefault(Locale.Category.FORMAT));

        // 打印条本地化消息
        System.out.println(hello);
        System.out.println(now);
    }
}
