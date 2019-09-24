package entity;

public enum Role {
    USER("USER"), ADMIN("ADMIN"), BOOKMAKER("BOOKMAKER");
    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
