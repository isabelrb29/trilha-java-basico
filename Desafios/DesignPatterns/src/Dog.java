public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Dog says: au au");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dog prefer taking a walk... \n");
    }
}
