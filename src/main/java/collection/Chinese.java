package collection;

import java.util.*;

public class Chinese {
    private List<String> schools;
    private Map scores;
    private Map<String, Axe> phaseAxes;
    private Properties health;
    private Set axes;
    private String[] books;

    public Chinese(){
        System.out.println("Spring实例化主调bean: Chinese实例...");
    }

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public Map getScores() {
        return scores;
    }

    public void setScores(Map scores) {
        this.scores = scores;
    }

    public Map<String, Axe> getPhaseAxes() {
        return phaseAxes;
    }

    public void setPhaseAxes(Map<String, Axe> phaseAxes) {
        this.phaseAxes = phaseAxes;
    }

    public Properties getHealth() {
        return health;
    }

    public void setHealth(Properties health) {
        this.health = health;
    }

    public Set getAxes() {
        return axes;
    }

    public void setAxes(Set axes) {
        this.axes = axes;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "schools=" + schools +
                ", scores=" + scores +
                ", phaseAxes=" + phaseAxes +
                ", health=" + health +
                ", axes=" + axes +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
