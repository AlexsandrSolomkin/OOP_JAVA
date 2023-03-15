package DZ_OOP_JAVA.DZ_SEMINAR_1_2;

public class Locker {

    private boolean status;

    public Locker() {
        this.status = getStatus();
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
