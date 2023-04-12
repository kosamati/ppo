package main;

public class Barman {

    public Drink createDrink(Ingredient A, Ingredient B, Ingredient C){
        Drink obj = new Drink(A,B,C);
        return obj;
    };
    public String printDrink(Drink d){
        double sum = d.getAAA().getMl()+d.getBBB().getMl()+d.getCCC().getMl();

        return d.getAAA().getName()+", "+d.getBBB().getName()+", "+d.getCCC().getName()+" w proporcjach "+
                String.valueOf(d.getAAA().getMl()/sum)+", "+
                String.valueOf(d.getBBB().getMl()/sum)+", "+
                String.valueOf(d.getCCC().getMl()/sum)+", "+
                "jego pojemność to "+ String.valueOf(sum)+"ml"

                ;
    };
}
