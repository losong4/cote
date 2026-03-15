/* 
 * 백준 제출할 때에는 패키지명을 지우고, 클래스명을 Main으로 수정한 다음 제출
 */

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class FindNumber {
	public static void main(String[] args) throws IOException{
	var reader = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(reader.readLine());
	var tokenizer = new StringTokenizer(reader.readLine());
	HashSet<Integer> set = new HashSet<>();
	for (int i = 0; i < N; i++) {
		set.add(Integer.parseInt(tokenizer.nextToken()));
	}
	
	int M = Integer.parseInt(reader.readLine());
	tokenizer = new StringTokenizer(reader.readLine());
	
	var builder = new StringBuilder();
	for (int i = 0; i < M; i++) {
		int target = Integer.parseInt(tokenizer.nextToken());
		
		if(set.contains(target)) {
			builder.append(1).append("\n");
		} else {
			builder.append(0).append("\n");
		}
	}
	System.out.println(builder.toString());
	}
}