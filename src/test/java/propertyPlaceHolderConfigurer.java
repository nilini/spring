import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import propertyPlacehodlerConfigurer.China;

public class propertyPlaceHolderConfigurer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertyPlaceHolderConfigurer.xml");
        China china = context.getBean("china", China.class);
        System.out.println(china);
    }
}
