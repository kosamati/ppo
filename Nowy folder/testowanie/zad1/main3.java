packagepl.devfoundry.testing.homework;
importjava.util.ArrayList;
importjava.util.List;
importjava.util.Random;

public class Unit{
    
    private static Random random =newRandom();
    private Coordinates coordinates;
    private int fuel;13.privateintmaxFuel;
    private List<Cargo>cargo;
    private int maxCargoWeight;
    private int currentCargoWeight;
    
    Unit(Coordinates startCoordinates,int maxFuel,int maxCargoWeight){
        
        this.coordinates =startCoordinates;
        this.maxFuel =maxFuel;
        this.fuel =maxFuel;
        this.maxCargoWeight =maxCargoWeight;
        this.currentCargoWeight =0;
        this.cargo =newArrayList<>();
        }
        Coordinatesmove(intx,inty){
            
            if(this.fuel -(x +y)<0){
                throw new Illegal State Exception("Unit cannot move that far");
                }


Coordinates coordinatesAfterMove =Coordinates.copy(this.coordinates,x,y);
this.coordinates =coordinatesAfterMove;37.38.this.fuel =this.fuel -(x +y);
return coordinatesAfterMove;
}

voidtankUp(){
    
    int restPoints =random.nextInt(10);
    if(restPoints +this.fuel >=maxFuel){
        this.fuel =maxFuel;
        }else{
            this.fuel +=restPoints;
            }
            
            }
            
            voidloadCargo(Cargocargo){
                
                if(currentCargoWeight +cargo.getWeight()>maxCargoWeight){
                    thrownewIllegalStateException("Can not load any more cargo");
                    }
                    
                    this.cargo.add(cargo);
                    
                    this.currentCargoWeight =calculateCargoWeight();
}

void unloadCargo(Cargocargo){
    this.cargo.remove(cargo);
    this.currentCargoWeight =calculateCargoWeight();
    }
    
    void unloadAllCargo(){
        cargo.clear();
        this.currentCargoWeight =0;
        }
        
    private int calculateCargoWeight(){
        return cargo.stream().mapToInt(Cargo::getWeight).sum();
    }
            
    int getFuel(){
        return this.fuel;
        }
    int getLoad(){
        return this.currentCargoWeight;
    }
}