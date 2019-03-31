import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initializingBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("initializingBean.xml");

    }
}
