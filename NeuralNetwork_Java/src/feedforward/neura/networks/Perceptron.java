package feedforward.neura.networks;

public class Perceptron {

	private float[] weights;
	private float[][] input;
	private float[] output;
	private int numOfWeights;
	
	public Perceptron(float[][] input, float[] outout) {
		this.input = input;
		this.output = outout;
		this.numOfWeights = input[0].length; // 2 wejscia perceptronu
		this.weights = new float[numOfWeights]; 
		
		initializeWeight();// wyzerowanei wag
	}
	private void initializeWeight() {
		
		for(int i=0;i<numOfWeights; i++) {
			weights[i]= 0;
			// wyzerowanei wagi weights[i];
		}
		
	}
	
	public void train(float learningRate, int epoch) {
		float totalError = 1;
		int currentEpoch = 0;
		
		while((totalError !=0) &  (currentEpoch < epoch)) {
			totalError = 0;
			System.out.println("\n-- EPOCH "+currentEpoch+" -- \n");
			for(int i = 0; i<output.length;i++) {
				float calculatedOutput = calculateOutput(input[i]);
				float error = Math.abs(output[i]-calculatedOutput);
				System.out.println(output[i]+" - "+calculatedOutput);
				
				totalError += error;
				
				
				for(int j=0;j<numOfWeights; j++) {
					// weight(n+1) = weight(n)+input*error*lerningRate(<1)
					weights[j] = weights[j]+learningRate*input[i][j]*error;
				}
			}
			
			currentEpoch++;
			
			System.out.println("keep on trening the network, error is: "+totalError);
		}
	}
	
	public float calculateOutput(float[] input) {
		float sum = 0f;
		for(int i =0; i<input.length;++i) {
			sum = sum + weights[i]*input[i];
			System.out.println("calculateOutPut: weight * input ( "+weights[i]+" * "+input[i]+" ) Sum: "+sum);
		}
		System.out.println();
		return ActivationFunction.stepFunction(sum);
	}
}
