package back.propagation.neural.network;

public class App {

	public static void main(String[] args) {
		/*
		float[][] traningData = new float[][] {
			new float[]  {0,0},
			new float[]  {0,1},
			new float[]  {1,0},
			new float[]  {1,1}
		};
		
		float[][] treningResults = new float[][] {
			
			new float[] {0},
			new float[] {1},
			new float[] {1},
			new float[] {1}
		};
		*/
		
		float[][] traningData = new float[][] {
			
			// first -> (1,0,0)
			new float[] {0.1f, 0.2f},
			new float[] {0.3f, 0.2f},
			new float[] {0.15f, 0.58f},
			new float[] {0.45f, 0.7f},
			new float[] {0.4f, 0.9f},
			// second -> (0,1,0)
			new float[] {0.4f, 1.2f},
			new float[] {0.45f, 0.95f},
			new float[] {0.42f, 1f},
			new float[] {0.5f, 1.1f},
			new float[] {0.52f, 1.45f},
			// third -> (0,0,1)
			new float[] {0.6f, 0.2f},
			new float[] {0.75f, 0.7f},
			new float[] {0.9f, 0.34f},
			new float[] {0.85f, 0.76f},
			new float[] {0.8f, 0.34f},
			
		};
		
		float[][] treningResults = new float[][] {
			new float[]  {1,0,0},
			new float[]  {1,0,0},
			new float[]  {1,0,0},
			new float[]  {1,0,0},
			new float[]  {1,0,0},
			new float[]  {0,1,0},
			new float[]  {0,1,0},
			new float[]  {0,1,0},
			new float[]  {0,1,0},
			new float[]  {0,1,0},
			new float[]  {0,0,1},
			new float[]  {0,0,1},
			new float[]  {0,0,1},
			new float[]  {0,0,1},
			new float[]  {0,0,1},
		};
		
		//BackPropagationNeuralNetwork backPropagationNeuralNetwork = new BackPropagationNeuralNetwork(2, 3, 1);
		BackPropagationNeuralNetwork backPropagationNeuralNetwork = new BackPropagationNeuralNetwork(2, 4, 3);
		
		for(int iteration = 0; iteration<NeuralNetConstans.ITERATIONS; iteration++) {
			//System.out.println("Epoch: "+(iteration+1));
			for(int i=0;i<treningResults.length;i++) {
				backPropagationNeuralNetwork.train(traningData[i], treningResults[i], NeuralNetConstans.LERNING_RATE, NeuralNetConstans.MOMENTUM);
			}
			
			/*
			System.out.println();
			
			for(int i=0; i<treningResults.length;i++) {
				float[] t = traningData[i];
				System.out.println("Num of iterations: "+iteration+1);
				System.out.printf("%.1f, %.1f --> %.3f\n",t[0],t[1],backPropagationNeuralNetwork.run(t)[0]);
			}
			*/
		}
		// testing
		
		float[] result = backPropagationNeuralNetwork.run(new float[] {0.11f,0.12f});
		System.out.println(result[0]+" - "+result[1]+" - "+result[2]);
	}
	
}
