import java.util.function.Consumer;

public class A<T> {
    private final Consumer<T> consumer;

    public A(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void foo(T a) {
        this.consumer.accept(a);
    }
}
