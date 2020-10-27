import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
	
	public boolean check(String val1, String val2) {
		
		if(val1.length() != val2.length()) return false; // 두 단어 길이가 다르면 return false
		
		//toLowerCase() : 문자열을 소문자로 변환해서 반환.
		//toCharArray() : 문자열을 char형 배열로 바꾼다.
		char[] c1 = val1.toLowerCase().toCharArray();
		char[] c2 = val2.toLowerCase().toCharArray();
		
		//Arrays.sort() : 오름차순 정렬
		Arrays.sort(c1);
		Arrays.sort(c2);
		

		for (int i = 0; i < c1.length; i++) // 배열c1 길이까지 반복해서 체크했을때
			if(c1[i]!=c2[i]) // 만약 두 배열이 다르면
				return false; // false
		
		return true; // 같으면 true
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 단어를 입력하세요 : ");
		String word1 = sc.nextLine();
		System.out.print("두번째 단어를 입력하세요 : ");
		String word2 = sc.nextLine();
		
		Anagram2 anagram = new Anagram2();
		
		System.out.println("두 단어는 Anagram ?  " + anagram.check(word1, word2));
			
		sc.close();
	}
}
