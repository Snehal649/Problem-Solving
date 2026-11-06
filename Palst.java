import java.util.*;
public class Palst{
    public static boolean isPalindrome(String Str){
        for(int i=0;i<Str.length()/2;i++){
            int n= Str.length();
            if(Str.charAt(i)!=Str.charAt(n-i-1)){
                return false;
            
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String Str=sc.nextLine();
        if(isPalindrome(Str)){
            System.out.println("String is palindrome ");
        }else{
            System.out.println("String is not Palindrome");
        }


    }}