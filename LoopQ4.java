import java.util.*;
public class LoopQ4 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input");
        int input = sc.nextInt();
    do{
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        if(marks >=90){
            System.out.println("This is good");
        }
        else if(marks <=89 && marks >= 60){
            System.out.println("This is also good");
        }
        else if(marks<=59 && marks >=0){
            System.out.println("This is good as well");
        }
        else {
            System.out.println("Invalid");
        }

        System.out.println("Want to continue? yes(1)/no(0)");
        input = sc.nextInt();


    } while(input == 1);
 }    
}
