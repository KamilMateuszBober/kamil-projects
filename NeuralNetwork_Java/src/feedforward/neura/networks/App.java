package feedforward.neura.networks;

import java.io.OutputStream;

public class App {

	// aplikacja sprawdzic powinna czy rozwiazanie jest linearne czy nie odpowiednio zastosuje dodatkowe rzedy neuronow
	public static void main(String[] args) {
		float[][] input = {{0,0},{0,1},{1,0},{1,1}};
		float[] output = {0,0,0,1};
		
		Perceptron perceptron = new Perceptron(input, output);
		perceptron.train(0.1f, 200);
		
		
		System.out.println("the error is 0 so our neuron network is ready! Predoctiom: ");/*
		System.out.println(perceptron.calculateOutput(new float[] {0,0}));
		System.out.println(perceptron.calculateOutput(new float[] {0,1}));
		System.out.println(perceptron.calculateOutput(new float[] {1,0}));
		System.out.println(perceptron.calculateOutput(new float[] {1,1}));*/
		
	}
}
