package propertyPlacehodlerConfigurer;

public class China {
    private String name;
    private int area;

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "China{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
