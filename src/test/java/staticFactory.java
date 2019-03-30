import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import staticFactory.Being;

public class staticFactory {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("staticFactoryBeans.xml");
        Being b1 = context.getBean("dog", Being.class);
        b1.testBeing();

        Being b2 = context.getBean("cat", Being.class);
        b2.testBeing();
    }
}
