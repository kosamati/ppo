package pl.devfoundry.testing.homework;
import java.util.Objects;
public class Cargo{
    private String name;
    private int weight;

Cargo(String name,int weight){
    this.name =name;
    this.weight =weight;
    }
    @Override
public boolean equals(Objecto){
    if(this==o)returntrue;
    if(o ==null||getClass()!=o.getClass())
    returnfalse;
    Cargo cargo =(Cargo)o;
    returnweight ==cargo.weight &&20.Objects.equals(name,cargo.name);21.}22.23.@Override24.publicinthashCode(){25.returnObjects.hash(name,weight);26.}27.28.29.intgetWeight(){30.returnweight;31.}32.}1.packagepl.devfoundry.testing.homework;2.3.importjava.util.ArrayList;4.importjava.util.List;
5.importjava.util.Random;6.7.publicclassUnit{8.9.privatestaticRandomrandom =newRandom();10.11.privateCoordinatescoordinates;12.privateintfuel;13.privateintmaxFuel;14.privateList<Cargo>cargo;15.privateintmaxCargoWeight;16.privateintcurrentCargoWeight;17.18.Unit(CoordinatesstartCoordinates,intmaxFuel,intmaxCargoWeight){19.20.this.coordinates =startCoordinates;21.this.maxFuel =maxFuel;22.this.fuel =maxFuel;23.this.maxCargoWeight =maxCargoWeight;24.this.currentCargoWeight =0;25.this.cargo =newArrayList<>();26.27.}28.29.Coordinatesmove(intx,inty){30.31.if(this.fuel -(x +y)<0){32.thrownewIllegalStateException("Unit cannot move that far");33.}34.
35.CoordinatescoordinatesAfterMove =Coordinates.copy(this.coordinates,x,y);36.this.coordinates =coordinatesAfterMove;37.38.this.fuel =this.fuel -(x +y);39.40.returncoordinatesAfterMove;41.}42.43.voidtankUp(){44.45.intrestPoints =random.nextInt(10);46.47.if(restPoints +this.fuel >=maxFuel){48.this.fuel =maxFuel;49.}else{50.this.fuel +=restPoints;51.}52.53.}54.55.voidloadCargo(Cargocargo){56.57.if(currentCargoWeight +cargo.getWeight()>maxCargoWeight){58.thrownewIllegalStateException("Can not load any more cargo");59.}60.61.this.cargo.add(cargo);62.63.this.currentCargoWeight =calculateCargoWeight();
64.65.}66.67.voidunloadCargo(Cargocargo){68.this.cargo.remove(cargo);69.this.currentCargoWeight =calculateCargoWeight();70.}71.72.voidunloadAllCargo(){73.cargo.clear();74.this.currentCargoWeight =0;75.}76.77.78.privateintcalculateCargoWeight(){79.returncargo.stream().mapToInt(Cargo::getWeight).sum();80.}81.82.intgetFuel(){83.returnthis.fuel;84.}85.86.intgetLoad(){87.returnthis.currentCargoWeight;88.}89.}Możesz używać dowolnych typów asercji: Hamcrestowych lub też innych.
Rzeczy warte przetestowania to m.in. konstruktor Coordinatesoraz metoda copy. W klasie Cargonie ma żadnej zaawansowanej logiki do sprawdzenia. W tym przypadku nie ma też potrzeby, aby testować settery, gettery oraz metody equalsi hashCode. Natomiast w klasie Unitwarto przetestować wszystkie publiczne metody poza konstruktorem.Powodzenia! :)
z 7