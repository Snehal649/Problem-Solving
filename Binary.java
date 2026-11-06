public class Binary {
    public static int binarySearch(int no[],int value) {
        int start=0;int end=no.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if( no[mid]==value){
                return mid;
            }
            if(no[mid]<value){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
     return -1;   
    }

  public static void main(String args[]){
    int no[]={3,7,9,4,2};
    int value=7;
    
    System.out.println("Index is at:"+binarySearch(no,value));
  }  
}
