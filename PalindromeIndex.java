/*
 Given a string of lowercase letters in the range ascii[a-z], determine the index of a character 
 that can be removed to make the string a palindrome. There may be more than one solution, but 
 any will do. If the word is already a palindrome or there is no solution, return -1. Otherwise, 
 return the index of a character to remove.
 
 Example:
 s = "bcbc"

Either remove 'b' at index 0 or 'c' at index 3.

Function Description:
Complete the palindromeIndex function in the editor below.
palindromeIndex has the following parameter(s):
string s: a string to analyze

Returns:
int: the index of the character to remove or -1

Input Format

The first line contains an integer q, the number of queries.
Each of the next q lines contains a query string s.

Constraints
1 <= q <= 20
1<= length of s <= 10^5+5

Sample Input:

STDIN   Function
-----   --------
3       q = 3
aaab    s = 'aaab' (first query)
baa     s = 'baa'  (second query)
aaa     s = 'aaa'  (third query)

Sample Output:
3
0
-1

Explanation
Query 1: "aaab"
Removing 'b' at index 0 results in a palindrome, so return 0.

Query 2: "baa"
Removing 'b' at index 3 results in a palindrome, so return 3.

Query 3: "aaa"
This string is already a palindrome, so return -1. Removing any one of the characters would result 
in a palindrome, but this test comes first.


Test case 1:
Input:
3
aaab
baa
aaa

Output:
3
0
-1

Test case 2:
Input:
5
kwpmqaykpapehyqmuovyacrkciglfxoruhfnhebahqeopvemkaonegahoguwemoctvrdbsdkjkybgdosffgklhtcpqbwdsyyoqdrkicvsexbjourtdchmxldopcuibtytyrgkvdfcdhmteepjiwwikcyaetihqkdremcaridwrrqvxghgfgqpipqombxdleurqaskixhapxxpehvjoobwetosvovjstclvwvewdgodgejncucqwcuqsoohmbdifqecnkysqnyytipvermbvjroajynkcxpsdtipuejkdielxapsmsqxniywhmjlmyerspintrawaekbebvsvmqjupgeepptqwllmtbilbfofrrlungrcxbapkewcwqttchiyjqkmxyupqglgndlnglfqrevouriayqykjlahluxebjnqoygukmoeqktoceqdxrohdopqlnvmylgnkmkwbybujwjnccratijwyyokomynxfbkumjvnkqxicnmefmxnvxoxoymbybbgenbswahjqfrvueabsbqrbgpphesghvnmjqfiqmrktkgpqismllemtvecawkksxweremitfsprbhimauxobniwrkarxkmvjrpneyjltadxhmkijkylxhksukmswyqishwaiileipcqembnxabxhmseyfyyfqhaagakpmoxcrqigrxgrahcoaipgionywnbfoludavhtmpdfnlypsdgtmwcunrvmfysvkpymlgjbxmimxhernlnakpwxjulotgngvmsivcltqtipbpjodwqnopnxkyoefcmergmpkalctutwmdopcfdsvssishpamcegksxvsjaogtmsybibinvghopcvhekjlsueqsabsohodbnglqpamxjbpnywrmhdfekywmardjghmtpbmfdyemctadttpbaxhkwgyyxckelxacymjenpqpmssgmljojqyiwahwfrbsrdusrhwfwpwjirrxdbmotowqoenvyqpstkmltlstcpdmixkn{-truncated-}
 
Output:
1185
-1
3968
657
9359

Test case 3:
Input:
5
rdiiucohmetsfayjtbytoscqwaoppmojrysmbjvonshusgemkfibxktulkkdwcnqbidfrcthudcplgcxnkblwwjkhvogxewcmdhghdpcirrvavwniayfxkqfhhohlllaqsixxxcirvfrrehceiictbkdiykvmwvergeqehyxdgrxkyaphktdlggvhtruqpbkvhbaodaulruysuqdimgttpsbjkxcbbmwjqaavawhurinpyqxmatipmjyxidblpawiaxeduoanwndyhdnhwvwkfxkpblesnbcqygtwwvkujpvqsjxpfwcmumfvajrqkthmcbjawvwinsciccajadvurdtumllahsojvxjuvifjbhtdktokynhrqbogoagvsuiqutlqdqcebxklryxrmflghamvauuurdnmwyfarjhshrgbsesikgotgdpixmfppsentjpouwheoqfkwbshhhbomtwkgdcyximsrehocqsshxdfyvojfsxrmweucitbqitknbyrttkcuqjvmafusdofdvdfeygviaixdkraeecyunvkndfhhtokptpwtyuebdehnvhsaltvyriovnxdjppcjhyditjkwnrnjbgmmcknuscqibvrsntcwuigorqogkerlkexoqljjpcrsxmlngolewruqklwuppgcvgrntbyjetdegosofgsexqvicsfsknujvmypqayutebcvvrdcmicdemgyrbmhvvdlwscwuwrbavywndbdlegrsosnpfuodbaavcaqbtubptagyejmkredhaqyhoplppnlrnfuhayavygxdpknjrtqrksybimqybfsqkqympbkohiuytkilecfruesftmgurclesmqinbywktvghhrljyfgfblyputhwinruealhyktvhadqtqasygyctxrqubndofashnajyufiwkyrbykchledkvuhwkklskgcbjlagqiddhuhiijrtowgmrnmfaaanhcosooyhyelicsqkckgshpicduje{-truncated-}

Output:
-1
-1
8330
8859
3887

Test case 4:
Input:
10
fyjwtatuieusvfqaeynaaiiaanyeaqfvsueutatwjyf
qaaiyrpadovfjrmgkildtkseysejdtrpltptujlxxljutptlprtdjesyeskdlikgmrjfvodapryiaaq
llhrxcreddwkcronujfkwbdswoowsdbwkfjunorckwdderxrhll
qasfhkfcojhntlfkaydtepsfsleipymwsopposwmypielsfspetdykfltnhjocfkhfsaq
broifqivnnvifiorb
bglgcwnmpobohqefrglsaaaaslgrfeqhobopmnwcglgb
bthvmywukfwrkslaiialskwfkuwymvhtb
uxxdlselxmwyiguugtpsypfudffswvwyswyyiiyywsywvsffdufpysptguugiywmxlesldxxu
rvscdpyljqglgmiktfndsmfnkgmubrruloqptgohsgneocoyyocoengshogtpqolurrbumgknfmsdntkimglgqjlypdcsvr
qmdpbsswvmqtyhkobqeijjieqbokhytqmvwssbdmq

Output:
8
20
5
16
5
-1
11
28
17
3

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

class Result1 {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
    // Write your code here
        int palindromeIndex = -1; 
        int len = s.length();

		for (int i = 0; i < len / 2; i++) { 
		    if (s.charAt(i) != s.charAt(len - i - 1)) {
		        if (i+1 < len) {    
		            boolean isRightStringValidPalindrome = isValidPalindrome(s.substring(i + 1, len-i)); 
		            if (isRightStringValidPalindrome)
		                return i;
		        return len - i -1;
		        }
		    }
		}
		return palindromeIndex;
    }
    public static boolean isValidPalindrome(String str){
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) { 
                return false;
            }
        }
        return true;
    }
}

public class PalindromeIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result1.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
