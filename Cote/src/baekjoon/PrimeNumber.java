/* 
 * 백준 제출할 때에는 패키지명을 지우고, 클래스명을 Main으로 수정한 다음 제출
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        var line = reader.readLine();
        if (line == null) return;
        int N = Integer.parseInt(line);

        int count = 0;
        var st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}