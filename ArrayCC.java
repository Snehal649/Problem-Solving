import java.util.*;
public class ArrayCC{
public static int getLargest(int numbers[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(largest<numbers[i]){
            largest=numbers[i];
        }

    } return largest;}
    public static void main(String args[]){
        int numbers[]={1,3,5,6,8};
        System.out.println("Largest number is:"+getLargest(numbers));
    }

    
}

