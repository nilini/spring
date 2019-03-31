import abstractBean.American;
import abstractBean.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class abstractBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("abstractBeans.xml");
        Chinese chinese = context.getBean("chinese", Chinese.class);
        American american = context.getBean("american", American.class);
        System.out.println(chinese);
        System.out.println(american);
    }
}
