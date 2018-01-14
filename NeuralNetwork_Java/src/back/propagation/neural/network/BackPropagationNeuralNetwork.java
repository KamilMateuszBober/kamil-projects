package back.propagation.neural.network;

public class BackPropagationNeuralNetwork {
	
	private Layer[] layers;
	
	public BackPropagationNeuralNetwork(int inputSize, int hiddenSize, int outputSize) {
		layers = new Layer[2];
		layers[0] = new Layer(inputSize,hiddenSize);
		layers[1] = new Layer(hiddenSize,outputSize);
		
	}
	
	public BackPropagationNeuralNetwork(int inputSize, int[] layersSize) {
		layers = new Layer[layersSize.length];
		for(int i =0; i<layersSize.length; i++) {
			int inSize = i == 0 ? inputSize : layersSize[i-1];
			layers[i]= new Layer(inSize, layersSize[i]);
			
		}
	}

	public Layer getlayer(int index) {
		return layers[index];
	}
		
	public float[] run(float[] input) {
		float[] activations = input;
		
		for(int i=0; i<layers.length;i++) {
			activations = layers[i].run(activations);
		}
		return activations;
	}
	
	public void train(float[] input, float[] targetOutput, float learningRate, float momentum) {
		float[] calculatedOutput = run(input);
		float[] error = new float[calculatedOutput.length];
		
		for(int i=0; i<error.length;i++) {
			// Mean square Error: "MSE"
			error[i] = targetOutput[i] - calculatedOutput[i];
		}
		//backpropagation
		for(int i = layers.length-1;i>=0;i--) {
			error = layers[i].train(error,learningRate,momentum);
		}
	}
}
