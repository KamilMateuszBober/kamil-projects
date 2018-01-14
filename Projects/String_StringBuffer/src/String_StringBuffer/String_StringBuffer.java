package String_StringBuffer;

public class String_StringBuffer {

	public static void main(String args[]) {
		String s = new String("String s = new String(\"String\");");
		String ss = "String ss = \"ss\";";
		
		
		System.out.println(s);System.out.println();
		System.out.println(ss);System.out.println();
		
		System.out.println("s.concat // ss.concat");System.out.println();
		s.concat(" s.concat");
		s.concat(" ss.concat");


		System.out.println(s);System.out.println();
		System.out.println(ss);System.out.println();
		
		String sss = s.concat(ss);
		System.out.println("String sss = s.concat(ss); ");System.out.println();
		System.out.println(sss);
		
		String ssss = ss;
		
		
		System.out.println(ssss.length());
		System.out.println(ssss.compareTo(ss));
		System.out.println(ssss.equals(ss));
		ssss = ssss+"    H O U S E    ";
		ssss = ssss.trim();
		ssss= ssss+"2";
		System.out.println(ssss);
		
		
	}

}
