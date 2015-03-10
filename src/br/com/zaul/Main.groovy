package br.com.zaul

class Main {

	static void main(args) {
		PrimesCalculator calculator = new PrimesCalculator() 
		
		def firstTenPrimes = calculator.getPrimes(10)
		
		assert firstTenPrimes.get(0) == 1
		assert firstTenPrimes.get(5) == 11
		assert firstTenPrimes.get(9) == 23
	}
}
