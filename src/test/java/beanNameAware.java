import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beanNameAware.Chinese;

public class beanNameAware {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanNameAware.xml");
        Chinese chinese = context.getBean("chinese", Chinese.class);
        chinese.info();
    }
}
