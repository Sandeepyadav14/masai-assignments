
public class PrimeNumber {

    public int[]  findAndReturnPrimeNumbers(int[] inputArray) {
        int k=inputArray.length;
        int count=0;
       for(int i=0;i<k;i++) {
           boolean s = true;
           for (int j = 2; j < inputArray[i]; j++) {
               if (inputArray[i] % j == 0) {
                   s = false;
                   break;
               }
           }
           if (s) {
               System.out.print(inputArray[i] + " ");
               count++;
           }
       }
       if(count==0){
           System.out.print("Prime number not found in the supplied Array");
       }

       return inputArray;
    }
    public static void main(String[] args) {
        int[] arr = {10,12,5,50,11,14,15};
        PrimeNumber s=new PrimeNumber();
        s.findAndReturnPrimeNumbers(arr);
    }

}