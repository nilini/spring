import annotation.autowired.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class autowiredTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
        Chinese chinese = context.getBean("chinese", Chinese.class);
        System.out.println(chinese.getAxe().chop());
    }
}
