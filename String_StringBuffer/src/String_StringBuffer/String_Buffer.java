package String_StringBuffer;

public class String_Buffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(" JAVA ");
		sb.append("WORLD");
		sb.insert(0, "HELLO");
		
		System.out.println(sb);
		
		sb.replace(5, 6, " thread safe ");
		
		System.out.println(sb);

	}

}
