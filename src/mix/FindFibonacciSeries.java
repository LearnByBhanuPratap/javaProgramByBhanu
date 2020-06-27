package mix;
public class FindFibonacciSeries {
 
    public static void main(String a[]){
         
         int number = 11;
         int[] feb = new int[number];
         feb[0] = 0;
         feb[1] = 1;
         
         for(int i=2; i < number; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< number; i++){
                 System.out.print(feb[i] + " ");
         }
    }
}