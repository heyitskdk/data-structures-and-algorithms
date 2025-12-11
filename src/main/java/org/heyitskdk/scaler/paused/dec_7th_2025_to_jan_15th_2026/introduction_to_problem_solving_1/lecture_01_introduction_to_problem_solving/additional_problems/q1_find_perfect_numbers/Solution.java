package org.heyitskdk.scaler.paused.dec_7th_2025_to_jan_15th_2026.introduction_to_problem_solving_1.lecture_01_introduction_to_problem_solving.additional_problems.q1_find_perfect_numbers;

public class Solution {

    public int solve(int A) {
        if (A == 1) return 0;

        int sumOfDivisors = 1;
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A / i) {
                    sumOfDivisors += i;
                } else {
                    sumOfDivisors += i + (A / i);
                }
            }
        }

        return sumOfDivisors == A ? 1 : 0;
    }
}
