package hopfield.neural.network;

public class Activationfunctions {

	public static int stepFunction(double x) {
		if(x >= 0) {
			return 1;
		}else {
			return -1;
		}
	}
}
