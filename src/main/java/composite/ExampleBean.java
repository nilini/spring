package composite;

public class ExampleBean {
    private Person person = new Person();

    public Person getPerson() {
        return this.person;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "person=" + person +
                '}';
    }
}
