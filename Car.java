enum PowerType {ELECTRIC, UNLEADED, DIESEL}
enum CarStyle {SEDAN, COUPE, TRUCK, SUV}


public class Car {
    private int horsePower = 180;
    private PowerType powerType;
    private CarStyle carStyle; 

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int HP){

        if(HP < 180) 
            horsePower = 180;
        else if( HP > 200)
            horsePower = 200;
        else horsePower = HP;
        
    }

    public CarStyle getCarStyle() {
        return carStyle;
    }

    public void setCarStyle(CarStyle CS) {
        carStyle = CS;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType PT){
        powerType = PT;
    }
}
