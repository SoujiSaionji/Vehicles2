/**
 * Created by Саня on 26.04.2017.
 */
public class APC extends ArmoredVehicles {

    private final int MAX_SPEED = 80;
    private final int MIN_SPEED = 0;
    private final int MAX_PASSENGERS = 3;
    private final int MIN_PASSENGERS = 0;
    private int passengers;

    public int getPassengersNumber() {
        return passengers;
    }

    APC(String name, int speed, int passengers, int mass, int movements){
        super(name,speed, passengers, mass);
        if(passengers>MAX_PASSENGERS) this.passengers = MAX_PASSENGERS;
        else
        if(passengers<MIN_PASSENGERS) this.passengers = MIN_PASSENGERS;
        else this.passengers = passengers;

    }
    public String toString(){
        return "Name = " + getName() + "\nMass = "+ getMass()+"\nSpeed = " + getSpeed()+ "\nPass = " + getPassengersNumber()+ "\nMovNumber = " + getMovementsNumber();
    }

}
