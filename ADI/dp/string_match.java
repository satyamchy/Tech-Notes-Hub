import java.util.*;

public class XFromYMarks {

    public static int minStringFactor(String X, String Y, int S, int R) {
        int n = X.length();
        int m = Y.length();
        
        // Reverse of string Y
        String Y_rev = new StringBuilder(Y).reverse().toString();
        String yrev = new StringBuffer(Y).reverse().toString();
        
        // DP array initialized to infinity
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;  // Base case: no substrings are needed to form an empty string

        // Iterate over all positions in X
        for (int i = 0; i < n; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue; // Skip if not reachable
            }

            // Try substrings from Y and Y_rev
            for (int j = i + 1; j <= n; j++) {
                String X_sub = X.substring(i, j);

                // Check for matches in Y
                for (int k = 0; k < m; k++) {
                    for (int l = k + 1; l <= m; l++) {
                        String Y_sub = Y.substring(k, l);
                        if (X_sub.equals(Y_sub)) {
                            dp[j] = Math.min(dp[j], dp[i] + S);
                        }
                        String Y_sub_rev = Y_rev.substring(k, l);
                        if (X_sub.equals(Y_sub_rev)) {
                            dp[j] = Math.min(dp[j], dp[i] + R);
                        }
                    }
                }
            }
        }

        // Return the result from dp[n], or "Impossible" if it cannot be formed
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input strings X, Y
        String X = sc.nextLine();
        String Y = sc.nextLine();
        
        // Input integers S, R
        int S = sc.nextInt();
        int R = sc.nextInt();
        
        // Find the minimum string factor
        int result = minStringFactor(X, Y, S, R);
        
        if (result == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }
        
        sc.close();
    }
}
