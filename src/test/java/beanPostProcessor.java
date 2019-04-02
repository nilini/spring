import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beanPostProcessor.Chinese;
public class beanPostProcessor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanPostProcessor.xml");
        Chinese c = (Chinese)context.getBean("chinese");
        System.out.println(c);
    }
}
