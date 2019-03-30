import composite.ExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class compositeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("compositebeans.xml");
        ExampleBean exampleBean = (ExampleBean)context.getBean("exampleBean");
        System.out.println(exampleBean);
    }
}
