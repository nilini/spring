package intstanceFactory;

public class American implements Person {
    @Override
    public String sayHello(String name) {
        return name + ", hello";
    }

    @Override
    public String sayGoodBye(String name) {
        return name + ", Good Bye";
    }
}
