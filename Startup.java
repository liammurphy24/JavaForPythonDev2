import java.util.Arrays;

/**
 * Startup
 */
public class Startup {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Circle 1s radius" + circle);
        
        System.out.println(getVowels("vetstotech"));
        System.out.println(vowels("vetstotech"));

        Circle circle2 = new Circle();
        System.out.println("Circle 2s radius" + circle2);


        circle.radius = 10;


        int radius = 5;
        System.out.println("radius1 " + radius);

        int radius2 = radius;
        System.out.println("radius2 " + radius2);

        radius = 76;
        System.out.println("radius 2 " + radius2);

        String name = "Liam";
        String name1 = "Liam";

        System.out.println(name.substring(1, name.length()));

        Student student = new Student();
        System.out.println(student.name);
        student.name = "Liam";
        System.out.println(student.name);
        student.GPA = Float.parseFloat("3.99");
        System.out.println("GPA " + student.GPA);
    }

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

public static int getVowels(String term) {
    String lowerCased = term.toLowerCase();
    int counter = 0;
    for(int i = 0; i < term.length(); i++) {
        char letter = term.charAt(i);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {

        }
    }
    return counter;

}
}    
        

    
