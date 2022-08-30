import java.util.*;
public class LoopQ3 {
    public static void main(String args[]){
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The even numbers between 1 and " +a);
        for(int i=1; i<=a; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
