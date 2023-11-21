package examples.domain;

public class Category {

    private String name;
    private boolean restricted;

    public Category(String name, boolean restricted) {
        this.name = name;
        this.restricted = restricted;
    }

    public boolean isRestricted() {
        return restricted;
    }

    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
