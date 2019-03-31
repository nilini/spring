import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import lookUpMethod.FruitPlate;
public class lookUpMethod {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lookUpMethod.xml");
        FruitPlate fruitPlate = context.getBean("fruitPlate", FruitPlate.class);
        FruitPlate fruitPlate2 = context.getBean("fruitPlate", FruitPlate.class);
        fruitPlate.talkAboutFruit();
        fruitPlate2.talkAboutFruit();
    }
}
