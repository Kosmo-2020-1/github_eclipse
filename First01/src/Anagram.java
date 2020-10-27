import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public boolean solve(String s1, String s2) {
		
		if(s1.length() != s2.length()) return false;
		
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		

		for (int i = 0; i < c1.length; i++) 
			if(c1[i]!=c2[i])
				return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주어진 문자열 : ");
		String ori = sc.nextLine();
		System.out.print("아나그램 답안 : ");
		String ans = sc.nextLine();
		
		Anagram anagram = new Anagram();
		
		System.out.println("Anagram ?  " + anagram.solve(ori, ans));
			
		sc.close();
	}
}
