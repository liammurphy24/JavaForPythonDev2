enum PowerType {ELECTRIC, UNLEADED, DIESEL}
enum CarStyle {SEDAN, COUPE, TRUCK, SUV}
enum Make {TOYOTA, HONDA, DODGE}
enum Model {COROLLA, CIVIC, DURANGO, CAMRY}

public class Car {
    private int horsePower = 180;
    private PowerType powerType;
    private CarStyle carStyle; 
    private Make carMake;
    private Model carModel;
    double carMileage;
    static int numberOfCars;
    final int year;

    public static double ConvertMileageToKilometers(double carMileage) {
        return carMileage * 1.609;
    }


    public int getHorsePower() {
        return horsePower;
    }

    public Car(Make carMake, Model carModel, int year) {
        this.carMake = carMake;
        this.carModel = carModel;
        numberOfCars++;
        this.year = year;
        
    }

    

    public String toString() {
        return carMake.toString() + " " + carModel.toString();
    }

    public void Drive(double carMileage){
        this.carMileage = this.carMileage + carMileage;

    }

    
    public void Honk () {
        System.out.println("HONK");
    
        
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
