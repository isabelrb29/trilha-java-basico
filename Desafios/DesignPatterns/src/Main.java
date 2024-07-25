//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //creating a Cat factory
        AnimalFactory catFactory = new CatFactory();
        //creating a Cat
        Animal cat = catFactory.createAnimal();
        //Cat actions
        cat.speak();
        cat.preferredAction();

        //creating a Dog factory
        AnimalFactory dogFactory = new DogFactory();
        //creating a Dog
        Animal dog = dogFactory.createAnimal();
        //Dog actions
        dog.speak();
        dog.preferredAction();
    }
}