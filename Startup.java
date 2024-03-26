import java.time.LocalDate;
import java.util.Arrays;

/**
 * Startup
 */
public class Startup {
    static int classLocal;

    public static void main(String[] args) {
        // Student student = new Student("Liam", LocalDate.of(1997, 11, 12));       
        // System.out.println(student);
        // System.out.println(student.getAge());

        // Student student2 = new Student("Gerald");
        // student2.major = Major.PSYCHOLOGY;
        // student2.dateOfBirth = LocalDate.of(1969, 11, 12);
        // System.out.println(student2);
        // System.out.println(student2.getAge());

        // Student student3 = new Student();

        // if(student.major == Major.COMPUTERSCIENCE) {
        //     System.out.println("Computers are the best");
        //}
        Car car1 = new Car(Make.DODGE, Model.DURANGO, 2018);
        car1.setHorsePower(14);
        car1.setCarStyle(CarStyle.SUV);;
        car1.setPowerType(PowerType.UNLEADED);;
        System.out.println(car1);

        Car car2 = new Car(Make.TOYOTA, Model.COROLLA, 2019);
        double carMileage = 180;
        car2.Drive(180);
        System.out.println(car2.toString() + " Miles driven " + car2.carMileage);

        Car car3 = new Car(Make.HONDA, Model.CIVIC, 2020);
        car3.setHorsePower(195);
        car3.Drive(195);
        System.out.println(car3.year + " " + car3.toString() + " " + 
        car3.ConvertMileageToKilometers(carMileage));

        Car car4 = new Car(Make.TOYOTA, Model.CAMRY, 2024);
        System.out.println("Car4 mileage: " + car4.carMileage);

        System.out.println("Number of cars on the road " + Car.numberOfCars);

        // System.out.println(car1.getHorsePower());
        // System.out.println(car2.getHorsePower());
        // System.out.println(car3.getHorsePower());


        Instructor teacher= new Instructor();
        teacher.email = "swagbruh@gmail.com";
        Instructor teacher2 = new Instructor();
        
    }
    /*public static double harmonic(int n) {
        int local = 0;
        System.out.println(local);
        System.out.println(classLocal); */

    
 public static int vowels(String testString) {
        int numVowels = 0;
        char[] vowelsArr = {'a', 'e', 'i', 'o', 'u'};
        
        for(char c : testString.toLowerCase().toCharArray()) {

            if (Arrays.binarySearch(vowelsArr, c) > 0) {
                    numVowels++;
            }
        }
        
        return numVowels;
    }

/*public static int getVowels(String term) {
    String lowerCased = term.toLowerCase();
    int counter = 0;
    for(int i = 0; i < term.length(); i++) {
        char letter = term.charAt(i);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {

        }
    }
    return counter;

} */
}    
        

    
