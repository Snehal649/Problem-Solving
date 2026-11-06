public class Linear {
    public static int linearSearch(int no[],int key){
        for(int i=0;i<no.length;i++){
            if(no[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int no[]={1,7,9,3,4};
        int key=4;
        int index=linearSearch(no,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key is at:"+index);
        }
    }
}
