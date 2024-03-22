import java.time.LocalDate;
import java.util.Arrays;

/**
 * Startup
 */
public class Startup {
    static int classLocal;

    public static void main(String[] args) {
        Student student = new Student();
        student.major = Major.COMPUTERSCIENCE;
        student.name = "Liam";
        student.dateOfBirth = LocalDate.of(1997, 11, 12);
        System.out.println(student.toString("Murphy"));
        System.out.println(student.getAge());

        Student student2 = new Student();
        student2.major = Major.PSYCHOLOGY;
        student2.name = "Gerald";
        student2.dateOfBirth = LocalDate.of(1969, 11, 12);
        System.out.println(student2);
        System.out.println(student2.getAge());

        if(student.major == Major.COMPUTERSCIENCE) {
            System.out.println("Computers are the best");
        }
        Car car1 = new Car();
        car1.setHorsePower(14);
        car1.setCarStyle(CarStyle.SUV);;
        car1.setPowerType(PowerType.UNLEADED);;

        Car car2 = new Car();
        Car car3 = new Car();
        car3.setHorsePower(195);;

        System.out.println(car1.getHorsePower());
        System.out.println(car2.getHorsePower());
        System.out.println(car3.getHorsePower());


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
        

    
