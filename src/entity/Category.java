package entity;

public enum Category  {
    FOOTBALL("FOOTBALL"), HOCKEY("HOCKEY"), BASKETBALL("BASKETBALL"), VOLLEYBALL("VOLLEYBALL");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
