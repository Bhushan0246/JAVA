import java.util.Scanner;
class Division_Percent{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for five subjects: ");
        float mark, sum = 0;
        for(int i = 0; i<5; i++){
            mark = sc.nextFloat();
            sum += mark;
        }
        float percent = (sum/500)*100;
        if(percent >= 85){
            System.out.println("Percentage = " + percent);
            System.out.println("Obtained 1st division");
        }
        else if(percent < 90 && percent >= 70){
            System.out.println("Percentage = " + percent);
            System.out.println("Obtained 2st division");
        }
        else if(percent >= 40){
            System.out.println("Percentage = " + percent);
            System.out.println("Obtained 3st division");
        }
        else{
            System.out.println("Percentage = " + percent);
            System.out.println("You Failed.");
        }
    }
}