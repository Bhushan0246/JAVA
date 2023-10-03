import java.util.Scanner;
class DistanceConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (in kms): ");
        float dis = sc.nextFloat();
        System.out.println("In Miles: " + (dis/1.609) + " mile");
        System.out.println("In Meters: " + (dis*1000) + " m");
        System.out.println("In Inches: " + (dis*39370) + " in");
        System.out.println("In Centimeters: " + (dis*100000) + " cm");
    }
}