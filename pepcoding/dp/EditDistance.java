import java.util.Scanner;

public class EditDistance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1;
        System.out.print("Enter the string1\t:\t");
        str1 = sc.next();

        String str2;
        System.out.print("Enter the string2\t:\t");
        str2 = sc.next();

        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // int result=EditDistanceFind(str1,str2,0,0,dp);

        // int result=EditDistanceFindLength(str1,str2,str1.length(),str2.length(),dp);

        int result = EditDistanceUSingDp(str1, str2);
        System.out.println("\nMinimum number of operation required are: " + result);

    }

    public static int EditDistanceFind(String str1, String str2, int i, int j, int dp[][]) {
        // base case
        if (i == str1.length()) {
            return str2.length() - j;
        } else if (j == str2.length()) {
            return str1.length() - i;
        }
        int ans = 0;

        // case if character are equal

        if (str1.charAt(i) == str2.charAt(j)) {
            ans = EditDistanceFind(str1, str2, i + 1, j + 1, dp);
        } else {
            int insertion = EditDistanceFind(str1, str2, i, j + 1, dp);
            int deletion = EditDistanceFind(str1, str2, i + 1, j, dp);
            int replace = EditDistanceFind(str1, str2, i + 1, j + 1, dp);
            ans = Math.min(insertion, Math.min(deletion, replace)) + 1;
        }

        dp[i][j] = ans;
        return dp[i][j];

    }

    // using length

    public static int EditDistanceFindLength(String str1, String str2, int m, int n, int dp[][]) {
        // base case

        // If first string is empty, the only option is to insert all characters of
        // second string into first
        if (m == 0) {
            return n;
        }

        // If second string is empty, the only option is to remove all characters of
        // first string

        else if (n == 0) {
            return m;
        }
        int ans = 0;

        // case if character are equal

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            ans = EditDistanceFindLength(str1, str2, m - 1, n - 1, dp);
        } else {
            int insertion = EditDistanceFindLength(str1, str2, m, n - 1, dp);
            int deletion = EditDistanceFindLength(str1, str2, m - 1, n, dp);
            int replace = EditDistanceFindLength(str1, str2, m - 1, n - 1, dp);
            ans = Math.min(insertion, Math.min(deletion, replace)) + 1;
        }

        dp[m][n] = ans;
        return dp[m][n];

    }

    // dp approach using length
    public static int EditDistanceUSingDp(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++)
        {
            for (int j = 0; j < dp[0].length; j++) 
            {
                if (i == 0) 
                {

                    dp[i][j] = j;
                    continue;
                }

                else if (j == 0)
                {
                    dp[i][j] = i;
                    continue;
                }

                // character is present at i-1 index ,j-1 index
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) 
                {
                    dp[i][j] = dp[i - 1][j - 1];
                } 
                else
                {
                    int replace = dp[i - 1][j - 1];
                    int insert = dp[i][j - 1];
                    int delete = dp[i - 1][j];

                    // finding the minimum among all three operation
                    dp[i][j] = Math.min(replace, Math.min(insert, delete)) + 1;

                }

            }
        }
        return dp[m][n];
    }

}
