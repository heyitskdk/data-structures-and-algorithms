package org.heyitskdk.scaler.paused.dec_7th_2025_to_jan_15th_2026.introduction_to_problem_solving_1.lecture_01_introduction_to_problem_solving.additional_problems.q5_count_of_primes;

public class Solution {

    public int solve(int A) {
        int totalPrimeNumbers = 0;

        for (int i = 2; i <= A; i++) {
            if (isPrime(i)) totalPrimeNumbers++;
        }

        return totalPrimeNumbers;
    }

    public static boolean isPrime(int N) {
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }
}
