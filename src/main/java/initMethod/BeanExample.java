package initMethod;

public class BeanExample {
    private String name;

    public BeanExample(String name) {
        this.name = name;
    }
    public void init_method(){
        System.out.println("BeanExample.init_method");
    }
}
