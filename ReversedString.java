/*
 * There is a string, s , of lowercase English letters that is repeated infinitely many times. Given an integer, n , find and print the number of letter a's in the first n letters of the infinite string.
Example:
S -‘abcac'
n - 10
The substring we consider is “abcacabcac”, the first 10 characters of the infinite string. There are 4 occurrences of a in the substring.

Function Description:
Complete the repeatedString function in the editor below.
repeatedString has the following parameter(s):
s: a string to repeat
n: the number of characters to consider

Returns
int: the frequency of a in the substring

Input Format
The first line contains a single string, 8.
The second line contains an integer, n.


Constraints
1<=|s|<=100
1≤ n ≤10^12
For 25% of the test cases, n < 10^6.

Sample Input 1:
aba
10
Sample Output 1: 
 7
Explanation: 
The first n = 10 letters of the infinite string are “abaabaabaa”. Because there are 7 a's, we return 7.

Test case 1: 
Input: 
aba
10

Output:
7

Test case 2:
Input: 
a
100000000

Output:
100000000

Test case 3:
Input:
d
1000

Output:
0

Test case 4:
Input:
aab
882787

Output:
588525
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
        int strLength = s.length();
        long q = 0, r = 0;
        q = n/strLength;
        r = n%strLength;
        long p = (r==0)?0:r;
        long aCount = q*getLetterCount(s,s.length()) + getLetterCount(s,p);
        return aCount;
    }
    public static long getLetterCount(String s, long strLength) {
        long count = 0; 
        for (int i = 0; i < strLength; i++) {
            if (s.charAt(i) == 'a') 
                count++;
        }
        return count;
    }
}
public class ReversedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
