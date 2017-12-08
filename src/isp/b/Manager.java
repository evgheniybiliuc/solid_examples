package isp.b;

public class Manager implements Worker {
    @Override
    public void work() {
        System.out.println("Manager do some important stuff");
    }

    @Override
    public void eat() {
        System.out.println("Manager eating");
    }
}
