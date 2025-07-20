package oops;

class Shape{
    String color ;
}

class Triangle extends Shape{
    int sides ;
}

public class Inheritance {
    public static void main(String[] args)
    {
        Triangle t = new Triangle();
        t.color = "Red";
        t.sides = 3;
    }


}
