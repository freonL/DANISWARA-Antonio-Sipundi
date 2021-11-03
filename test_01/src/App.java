import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int A[] = {21, 13, 27, 39, 47, 42, 52, 17};
        int B[] = {7, 13, 21, 31, 47, 17};

        int m = A.length;
        int n = B.length;
        
        System.out.print("Array 1: ");
        for(int i = 0; i < m; i++) {
            System.out.print(A[i] + " "); 
        }
        System.out.print("\n");
        System.out.print("Array 2: ");
        for(int i = 0; i < n; i++) {
            System.out.print(B[i] + " "); 
        }
        System.out.print("\n");
        ArrayList<Integer> output = intersect(A,B);
        System.out.print("output: ");
        for(int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i) + " "); 
        }
    }

    public static int intersect(int[] arr1, int[] arr2 ) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int m = arr1.length;
        int n = arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i =0, j=0;
        while ( i < m && j<n) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i++]);
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray();
        
    }

}
