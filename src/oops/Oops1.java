package oops;

class Car{
    String name;
    int year;
    String color;
    void carColor()
    {
       // this.color = color;
        System.out.println("The the color of car is "+color);
    }
}
public class Oops1 {
    public static void main(String[] args) {
     Car c= new Car();
     c.year = 2010;
     c.name= "Swift";
     c.color= "Red";

     Car c1 = new Car();
     c1.color="Black";
     c.carColor();
     c1.carColor();
    }

}
