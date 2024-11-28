
import java.util.Scanner;

public class GetArrayMean {

    
    public static float getArrayMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (float) sum / array.length; 
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = scanner.nextInt();
       
            int[] numbers = new int[n];
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number: ");
                numbers[i] = scanner.nextInt();
            }  
            float mean = getArrayMean(numbers); 
            System.out.printf("Mean of array is: %.2f", mean);
            
        }
    }
}

