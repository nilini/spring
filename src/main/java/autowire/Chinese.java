package autowire;

public class Chinese {
    private Dog dog;
    public void setDog(Dog dog){
        this.dog = dog;
    }
    public Dog geDog(){
        return this.dog;
    }
}
