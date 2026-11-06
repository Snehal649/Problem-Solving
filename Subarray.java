public class Subarray {
    public static int subarrayArr(int no[]){
        for(int i=0;i<no.length;i++){
            int start=i;
            for(int j=i;j<no.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println(no[k]+" ");
                }
            }System.out.println();
        }System.out.println();
        return -1;
    }
   public static void main(String args[]){
    int no[]={4,6,2,1,9,0};
    subarrayArr(no);
   } 
}
