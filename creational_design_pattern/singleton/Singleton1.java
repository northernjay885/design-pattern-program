package creational_design_pattern.singleton;

public class Singleton1 {

    private Singleton1() {

    }

    private static final class SingletonHolder {
        private static final Singleton1 singleton1 = new Singleton1();
    }


    public Singleton1 getInstance() {
        return SingletonHolder.singleton1;
    }
}
