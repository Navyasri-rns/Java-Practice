package stringPrograms;

public class ReplaceLowerCasetoUpperCaseandViceversa {
		public static void main(String[] args) {
			
			String s1 = "Navya Sri";
			String s2 = "";
			for(int i=0;i<s1.length();i++) {
				char c = s1.charAt(i);
				if(Character.isUpperCase(c)) {
					s2 = s2+ Character.toLowerCase(c);
				}
				else {
					s2 = s2+ Character.toUpperCase(c);
				}
			}
			System.out.println(s2);
		}

	}

