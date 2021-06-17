import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(n - 1) - i] + " ");
        }
    }
}


#reversing a value#
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
            
        }
        for (int i=0;i<N;i++)
        System.out.print(arr[(N - 1) - i] + " ");
    }
}
