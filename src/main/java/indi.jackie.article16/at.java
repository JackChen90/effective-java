package indi.jackie.article16;

/**
 * Created by Jackie on 2016/5/5.
 */
public class at
{
    static int count=0;
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int countCacheMiss(int max_cache_size, int[] page_requests)
    {
        // INSERT YOUR CODE HERE
        if(max_cache_size>0){
            int array[]= new int[max_cache_size];
            for(int i=0; i<page_requests.length; i++){
                if(!containElement(page_requests[i],array)){
                    count++;
                    if(i<max_cache_size){
                        array[i]=page_requests[i];
                        continue;
                    }
                    move(array, page_requests[i]);
                }

            }
        }
        System.out.print(count);
        return count;

    }
    // METHOD SIGNATURE ENDS

    private static void print(int array[]){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    private static boolean containElement(int element,int [] array){
        for(int i=0; i<array.length;i++){
            if(element==array[i]){
                return true;
            }
        }
        return false;
    }

    private static void move(int[] array,int m){
        for(int i=1; i<array.length;i++){
            array[i-1]=array[i];
        }
        array[array.length-1]=m;
    }
    public static void main(String[] args) {
        at at = new at();
        at.countCacheMiss(3,new int[]{3,7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0});
    }
}
