package abstractBean;

public class Chinese {
    private String name;
    private Axe axe;
    public void setAxe(Axe axe){
        this.axe = axe;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", axe=" + axe +
                '}';
    }
}
