package CollectionFramework;
import java.util.*;

class Student{
    int roll;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class Class_HashSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(1,"Shreyash"));
        set.add(new Student(1,"Shreyash"));
        set.add(new Student(2,"Shubham"));
        System.out.println(set);
    }
}
