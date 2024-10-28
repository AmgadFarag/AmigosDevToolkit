package personal.use.ssb.entities;

public enum RoleType {
    ADMIN(0),
    USER(1);

    private int value;

    RoleType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
