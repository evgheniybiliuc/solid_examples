package dip.b;

public class Manager {
    private Worker worker;

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void manage() {
        getWorker().work();
    }

}
