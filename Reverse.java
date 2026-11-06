public class Reverse {
    public static int reverseArr(int no[]){
        int first=0; int last=no.length-1;
        while(first<last){
            int temp=no[last];
            no[last]=no[first];
            no[first]=temp;
            first++;
            last--;
        }
      return -1; 
    }
   public static void main(String agrs[]){
    int no[]={7,5,9,2,1};
    reverseArr(no);
    for(int i=0;i<no.length;i++){
        System.out.println(no[i]+" ");
    }
    } 
   
}
