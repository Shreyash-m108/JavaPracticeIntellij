package oops;

public class objectClass {
    public static void main(String[] args) {
        Boy boy = new Boy(22,"Shreyash");
        System.out.println(boy);
    }

}

class Boy{
    int age;
    String name;

    public Boy(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString(){
        return "The name of the boy is "+name+" and his age is "+age;
    }
}
