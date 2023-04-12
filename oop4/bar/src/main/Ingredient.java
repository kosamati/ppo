package main;

public class Ingredient {
    private String name;
    private double ml;

    public Ingredient(String name, double ml) {
        this.name = name;
        this.ml = ml;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMl() {
        return ml;
    }

    public void setMl(double ml) {
        this.ml = ml;
    }
}
