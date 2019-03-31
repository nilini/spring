package abstractBean;

public class American {
    private String name;
    private Axe axe;

    public void setName(String name) {
        this.name = name;
    }

    public void setAxe(Axe axe){
        this.axe = axe;
    }

    @Override
    public String toString() {
        return "American{" +
                "name='" + name + '\'' +
                ", axe=" + axe +
                '}';
    }
}
