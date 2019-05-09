package CompleteInterview.GeeksforGeeks.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParanthesisChecker {
	
//	public static void main(String[] args) {
//		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println(" Enter a String To Check For Paranthesis ");
//		
//		String checkstring=scan.nextLine();
//		
//		if(checkstring.contains("(") || checkstring.contains("(")) {
//			System.out.println(" The Provided String Contains Paranthesis ");
//		}else {
//			System.out.println(" The Provided String Does not contain any paranthsis ");
//		}
//		
//	}
	
	public static void main(String[] args) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		String para = "(";
		Stack<Character> s = new Stack<>();
		boolean validity = true;
		for (int i = 0; i < para.length(); i++) {
			char chars = para.charAt(i);
			if (map.keySet().contains(chars)) {
				s.push(chars);
			} else if (map.values().contains(chars)) {
				if (!s.isEmpty() && chars == map.get(s.peek())) {
					s.pop();
				} else {
					validity = false;
					break;
				}
			}
		}
		if (validity && s.empty()) {
			System.out.println("its valid");
		} else {
			System.out.println("its invalid");
		}
	}
	

}
