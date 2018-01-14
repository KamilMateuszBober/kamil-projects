package hopfield.neural.network;

public class Utils {

	
	//Convert pattern to bipolar 1 or -1
	 public static double[] transform(double[] pattern) {
		 for(int i=0;i<pattern.length;i++) {
			 if( pattern[i] == 0) {
				 pattern[i] = -1;
			 }
		 }
		return pattern;
	 }
}
