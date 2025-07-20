package generics;

public class Container<T> {
    T item;

    public Container(T item){
        this.item = item;
    }

    public T getItem()
    {
        return this.item;
    }
}
