import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanFactoryPostProcessor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryPostProcessor.xml");

    }
}
