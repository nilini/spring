import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class propertyPathFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertyPathFactory.xml");
        System.out.println("系统获取son1: " + context.getBean("son1"));
    }
}
