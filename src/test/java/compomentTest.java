import annotation.component.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class compomentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("component.xml");
//        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        Chinese chinese = context.getBean("chinese", Chinese.class);
        System.out.println(chinese.getAxe().chop());
    }
}
