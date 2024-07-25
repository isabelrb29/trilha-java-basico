public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("Cat says: miau");
    }

    @Override
    public void preferredAction() {
        System.out.println("Cat prefer hunting...\n");
    }
}
