// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Height In Centemeter is " + convertToCentimeters(6, 5));
    }

    public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remHeightInInches){
        return convertToCentimeters((heightInFeet * 12) + remHeightInInches);
    }

}