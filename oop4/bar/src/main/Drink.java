package main;

public class Drink {
    private Ingredient AAA;
    private Ingredient BBB;
    private Ingredient CCC;

    public Drink(Ingredient AAA, Ingredient BBB, Ingredient CCC) {
        this.AAA = AAA;
        this.BBB = BBB;
        this.CCC = CCC;
    }

    public Ingredient getAAA() {
        return AAA;
    }

    public void setAAA(Ingredient AAA) {
        this.AAA = AAA;
    }

    public Ingredient getBBB() {
        return BBB;
    }

    public void setBBB(Ingredient BBB) {
        this.BBB = BBB;
    }

    public Ingredient getCCC() {
        return CCC;
    }

    public void setCCC(Ingredient CCC) {
        this.CCC = CCC;
    }


}
