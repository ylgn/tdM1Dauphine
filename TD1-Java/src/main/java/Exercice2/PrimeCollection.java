package Exercice2;

import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection {
	private ArrayList<Integer> collectionPrime;

	public PrimeCollection() {
		collectionPrime = new ArrayList<Integer>();
	}

	void initRandom(int n, int m) {
		Random randomCreator = new Random();
		for (int i = 0; i < n; i++) {
			collectionPrime.add(randomCreator.nextInt(m));
		}

	}

	boolean isPrime(int p) {
		for (int i = 2; i < Math.round(Math.sqrt(p)); i++) {
			if (p%i == 0) {
				return false;
			}
		}
		return true;
	}
	void printPrime() {
		for (Integer nb : collectionPrime) {
			if (isPrime(nb)) {
				System.out.println(nb);
			}
		}
	}
}
