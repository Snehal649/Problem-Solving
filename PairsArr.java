public class PairsArr {
    public static void arrPairs(int no[]){
        for(int i=0;i<no.length;i++){
            int curr= no[i];
            for(int j=i+1;j<no.length;j++){
                System.out.print("("+curr+ " " +no[j]+")");
            }System.out.println();
        }
    }
   public static void main(String args[]){
    int no[]={7,5,3,2,0};
    arrPairs(no);
   } 
}
