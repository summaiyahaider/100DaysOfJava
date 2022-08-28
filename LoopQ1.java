//Print the sum of first n natural numbers

import java.util.*;
public class LoopQ1 {
public static void main(String args[]){

    System.out.println("Enter an Integer");

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    int sum=0;
    for(i=1;i<=n;i++){
        sum=sum+i;
    }
    System.out.println(sum);
}    
}
