package br.com.zaul

import java.util.List;

class PrimesCalculator {

	def getPrimes(amount) {
		def counter = 1
		
		def primes = [counter]
		
		while (primes.size() < amount) {
			counter++
			
			if (isPrime(counter, primes)) {
				primes += counter
			}
		}
		
		primes
	}
	
	def isPrime(number, primes) {
		
		for (prime in primes) {
			if (prime != 1 && number % prime == 0) {
				return false
			}
		}
		
		true
	}
}
