package CarRentalService;

import java.util.*;
import java.util.concurrent.TimeUnit;

class Cars {
    private String CarId;
    private String CarModel;
    private String CarCompany;
    private boolean isAvailable;
    private double BasePrice;

    public Cars(String carId, String carModel, String carCompany, boolean isAvailable, double basePrice) {
        CarId = carId;
        CarModel = carModel;
        CarCompany = carCompany;
        this.isAvailable = isAvailable;
        this.BasePrice = basePrice;
    }

    public String getCarId() {
        return CarId;
    }

    public String getCarModel() {
        return CarModel;
    }

    public String getCarCompany() {
        return CarCompany;
    }

    public double getBasePrice(){
        return BasePrice;
    }

    public double calculatedPrice(int rentalDays){
        return BasePrice*rentalDays;
    }

    public void rent(){
        isAvailable=false;
    }

    public void returnedCar(){
        isAvailable=true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

class Rent {
    private Cars car;
    private Customer customer;
    private int rentalDays;

    public Rent(Cars car, Customer customer, int rentalDays) {
        this.car = car;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public Cars getCar() {
        return car;
    }

    public Customer getCustomerInformation() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }
}

class Customer {
    private String name ;
    private String CustomerId = "CUS00";

    public Customer(String customerId,String name) {
        this.name = name;
        CustomerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return CustomerId;
    }

}

class RentalService {
    private List<Cars> carsList ;
    private List<Customer> customerList;
    private List<Rent> rentList;

    public RentalService() {
        carsList= new ArrayList<>();
        customerList=new ArrayList<>();
        rentList=new ArrayList<>();
    }

    public void addCar(Cars car){
        carsList.add(car);
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public void rentCar(Cars car,Customer customer,int days){
        if(car.isAvailable()){
            car.rent();
            rentList.add(new Rent(car,customer,days));
            System.out.println("Car is rented successfully.");
        }
        else {
            System.out.println("Car is not available for renting.");
        }
    }
    
    public void returnCar(Cars car){
        Rent removeRent = null;
        for(Rent rent:rentList){
            if(rent.getCar()==car){
                removeRent = rent;
                break;
            }
        }
        if(removeRent!=null){
            rentList.remove(removeRent);
            System.out.println("Car returned Successfully.");
        }
        else {
            System.out.println("Car is not rented previously.");
        }
    }

    public void menu() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("********Welcome To Parshwa Car Rental Services*********");
            System.out.println("Enter a valid choice from below:");
            System.out.println("1.Rent a Car\n2.Return a Car\n3.Exit");
            int choice = sc.nextInt();
            sc.nextLine();


            if (choice == 1) {
                System.out.println("Enter your details:");
                System.out.println("Enter name:");
                String CustName = sc.nextLine();
                TimeUnit.SECONDS.sleep(2);
                System.out.println("\nAvailable Cars are:\n");
                System.out.println("CarID"+"   "+"CarCompany"+"    "+"Car Model"+"   "+ "Car Rent");
                for(Cars cars :carsList){
                    System.out.println(cars.getCarId()+"     "
                    +cars.getCarCompany()+"      "+cars.getCarModel()+"       "+cars.getBasePrice());
                }
                System.out.println("Enter a CarID you want to buy:");
                String InputID = sc.nextLine();
                System.out.println("How much days you want to rent:");
                int InputDay=sc.nextInt();
                sc.nextLine();

                Customer newCustomer =new Customer("CUS"+(customerList.size()+1),CustName);
                addCustomer(newCustomer);

                Cars selectedCar = null;
                for(Cars car:carsList){
                    if(car.getCarId().equals(InputID)&& car.isAvailable()){
                        selectedCar =car;
                        break;
                    }
                }
                if(selectedCar!=null){
                    double totalPrice = selectedCar.calculatedPrice(InputDay);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Retnal Information:");
                    System.out.println("Customer ID:"+newCustomer.getCustomerId());
                    System.out.println("Customer Name: "+newCustomer.getName());
                    System.out.println("Car selected: ");
                    System.out.println(selectedCar.getCarCompany()
                    +"\n"+selectedCar.getCarModel()+"\nRental Days:"+totalPrice);

                    System.out.println("Want to Rent?(Y/N):");
                    String confirm =sc.nextLine();
                    if(confirm.equalsIgnoreCase("Y")){
                        rentCar(selectedCar,newCustomer,InputDay);
                        System.out.println("Thanks for renting car.Happy Journey.");
                    }
                    else{
                        System.out.println("Rental Canceled.");
                    }

                }else{
                    System.out.println("Enter correct carid.");
                }
            }

            else if(choice==2){
                System.out.println("Enter a CarId:");
                String returncarId = sc.nextLine();
                Cars returnedcar = null;
                for(Cars car:carsList){
                    if(car.getCarId().equals(returncarId)&&!car.isAvailable()){
                        returnedcar=car;
                        break;
                    }
                }

                if(returnedcar!=null){
                    Customer customer =null;
                    for(Rent rental:rentList){
                        if(rental.getCar().equals(returnedcar)){
                            customer=rental.getCustomerInformation();
                            break;
                        }
                    }
                    if(customer!=null){
                        returnCar(returnedcar);
                        System.out.println("Car is Returned by "+customer.getName());
                    }else{
                        System.out.println("Car was not rented or missing information.");
                    }
                }else{
                    System.out.println("Invalid car iD");
                }


            }
            else if(choice==3){
                break;
            }
            else{
                System.out.println("Invalid Choice.");
            }
            sc.close();
        }
    }
}


public class CarRentalServiceProject {
    public static void main(String[] args) throws InterruptedException {
        RentalService car =new RentalService();
        Cars thar =new Cars("MAH1","Thar","Mahindra",true,3000);
        Cars swift =new Cars("SUZ1","Swift","Suzuki",true,1800);
        Cars tavera =new Cars("TOY1","Tavera","Toyota",true,2000);
        Cars baleno =new Cars("SUZ2","Baleno","Suzuki",true,1800);
        car.addCar(thar);
        car.addCar(swift);
        car.addCar(tavera);
        car.addCar(baleno);

        car.menu();
    }
}
