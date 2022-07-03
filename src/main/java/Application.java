import java.util.function.Consumer;

public class Application {



    static class AllocatorA implements Allocator {
        public A getA() {
            return new A<String>(System.out::println);
        }
    }

    static class AllocatorB implements Allocator {
        public static void doNothing(String s) {
            return;
        }

        public A getA() {
            return new A<>(AllocatorB::doNothing);
        }
    }

    public static void main(String[] args) {
        A a1 = new AllocatorA().getA();
        A a2 = new AllocatorB().getA();
        a1.foo("Hello, world!");
    }
}
