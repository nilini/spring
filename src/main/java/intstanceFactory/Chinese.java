package intstanceFactory;

public class Chinese implements Person {
    @Override
    public String sayHello(String name) {
        return name + ", 你好";
    }

    @Override
    public String sayGoodBye(String name) {
        return name + ", 下次再见";
    }
}
