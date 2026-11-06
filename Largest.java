public class Largest {
    public static int getLargest(int no[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<no.length;i++){
            if(largest<no[i]){
                 largest=no[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int no[]={4,7,5,2,1};
        System.out.println("Largest No is:"+getLargest(no));
    }
    
}
