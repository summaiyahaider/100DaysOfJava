//Print the table of a number input by the user
import java.util.*;
public class LoopQ2 {
    public static void main(String args[]){

        System.out.println("Enter an Integer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        for(i=i;i<=10;i++){
            System.out.println(n*i);
        }

    }
}
