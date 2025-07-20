package oops;

public class multipleInheritance {
    public static void main(String[] args) {
        xuv700 car = new xuv700();
        car.car();
        car.suv();
    }

    interface Car {
        void car();
        int wheels =4;
    }
    interface SUV{
        void suv();
    }

    static class xuv700 implements Car,SUV{
        @Override
       public void car()
        {
            System.out.println("xuv is a Car."+wheels);
        }
        @Override
        public void suv()
        {
            System.out.println("xuv is a vehicle.");
        }

        public void wheels()
        {
            System.out.println("It has "+wheels+"Wheels.");
        }
    }

}
