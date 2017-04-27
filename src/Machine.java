/**
 * Created by Саня on 26.04.2017.
 */
public abstract class Machine implements Run{

    private int speed;
    private String name;
    public int getSpeed(){
        return 0;
    }
    public String getName(){
        return name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    Machine(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

}
