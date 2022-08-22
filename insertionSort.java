import java.util.*;
public class insertionSort {
    void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1]=arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String args[]){
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements you want to sort: ");
        m=sc.nextInt();
        int[] a = new int[10];
        for(int k = 0; k < m; k++){
            a[k]=sc.nextInt();
        }
        insertionSort(a);



    }
}
