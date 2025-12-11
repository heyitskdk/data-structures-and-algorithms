package org.heyitskdk.scaler.paused.dec_7th_2025_to_jan_15th_2026.introduction_to_problem_solving_1.lecture_01_introduction_to_problem_solving.assignment.q1_count_factors_2;

public class Solution {

    public int solve(int A) {
        int factors = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A / i) {
                    factors++;
                } else {
                    factors += 2;
                }
            }
        }

        return factors;
    }
}
