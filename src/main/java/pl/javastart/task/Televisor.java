package pl.javastart.task;

public class Televisor {
    private boolean isActivated = false;

    public void turnOn() {
        setActivated(true);
    }

    public void turOff() {
        setActivated(false);
    }

    public void showStatus() {
        System.out.println(isActivated());
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
