import java.io.*;
import java.util.*;

class Solution {
    public ArrayList<Integer> perfect(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i, i - 1, 0)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    private boolean isPerfect(int num, int divisor, int sum) {
        if (divisor == 0) {
            return sum == num;
        }
        if (num % divisor == 0) {
            sum += divisor;
        }
        return isPerfect(num, divisor - 1, sum);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}
