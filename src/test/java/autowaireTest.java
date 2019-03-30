import autowire.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowaireTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowirebeans.xml");
        Chinese chinese = (Chinese) context.getBean("chinese");
        System.out.println(chinese.geDog().getName());
    }
}
