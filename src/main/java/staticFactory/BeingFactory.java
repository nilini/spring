package staticFactory;

public class BeingFactory {
    // 返回Being实例的静态工厂方法
    public static Being getBeing(String arg){
        if(arg.equalsIgnoreCase("dog")){
            return new Dog();
        }else{
            return new Cat();
        }
    }
}
