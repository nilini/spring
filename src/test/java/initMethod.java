import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initMethod {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanExample.xml");
    }
}
