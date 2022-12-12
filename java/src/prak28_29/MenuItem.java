package prak28_29;

public class MenuItem implements Item {
    private int cost;
    private String name;
    private String description;
    public MenuItem(int cost, String name, String description) {
        if(cost < 0 || name == null || description == null) throw new IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}