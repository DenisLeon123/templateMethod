package dleon;

public enum Select {
    YES("yes"),
    NO("no");

    private String name;

    Select(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
