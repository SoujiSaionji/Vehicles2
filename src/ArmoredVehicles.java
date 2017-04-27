/**
 * Created by Саня on 26.04.2017.
 */
public abstract class ArmoredVehicles extends Machine {
    private int passengers;
    private int movements;
    private int mass;

    public int getMovementsNumber() {
        return movements;
    }
    public int getMass(){
        return mass;
    }
    ArmoredVehicles (String name, int speed, int mass, int movements) {
        super(name, speed);
        this.mass = mass;
        this.movements = movements;

    };
}
