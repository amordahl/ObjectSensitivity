import java.util.function.Consumer;

class A<T> {
    private Consumer<T> consumer;

    A(Consumer<T> consumer) {
        this.consumer = consumer;
    }
    void foo(T s) {
        this.consumer.accept(s);
    }
}
