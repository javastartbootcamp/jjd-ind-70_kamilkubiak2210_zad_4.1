package pl.javastart.task;

public class Televisor {
    private boolean activated;

    public void turnOn() {
        activated = true;
    }

    public void turnOff() {
        activated = false;
    }

    public void showStatus() {
        System.out.println(activated);
    }
}
