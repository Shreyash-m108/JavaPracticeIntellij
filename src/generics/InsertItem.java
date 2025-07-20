package generics;

public class InsertItem {
    public static void main(String[] args) {
        Container<Double> container = new Container<>(41.2);
        System.out.println(container.getItem());

        Container<Integer> container1 = new Container<>(1);

        Container<String> container2 = new Container<>("SHREYASH");

        System.out.println(container1.getItem());
        System.out.println(container2.getItem());
    }
}
