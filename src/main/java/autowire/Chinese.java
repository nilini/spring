package autowire;

public class Chinese {
    private Dog dog;
    public void setGunDog(Dog dog){
        this.dog = dog;
    }
    public Dog geGunDog(){
        return this.dog;
    }
}
