package isp.g;

public class Manager implements Workable, Feedable {
    @Override
    public void eat() {
        System.out.println("Manager eating");
    }

    @Override
    public void work() {
        System.out.println("Manager do some important stuff");
    }
}
