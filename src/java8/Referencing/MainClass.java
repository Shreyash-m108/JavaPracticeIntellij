package java8.Referencing;

public class MainClass {
    public static void main(String[] args) {

        //If we want to implement the dog's property via lambda this is a easy way
        /*DogInterface dog = ()->{
            System.out.println("He can do many things.");
        };

        dog.dogProperties();*/

        //But we have many animals having same property then it could be hectic task
        //in that case we have method in other class consisting these properties via
        //method referencing we can use this
        DogInterface dog = AnimalProperties::properties;

        dog.dogProperties();


    }
}
