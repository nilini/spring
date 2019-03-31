package propertyPathFactory;

public class Person {
    private String name;
    private int age;
    private Son son;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSon(Son son) {
        this.son = son;
    }

    public Son getSon() {
        return son;
    }
}
