import collection.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collectionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionbeans.xml");
        Chinese chinese = (Chinese)context.getBean("chinese");
        System.out.println(chinese);
    }
}
