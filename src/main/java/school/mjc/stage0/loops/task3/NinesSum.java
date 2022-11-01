package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else {
            int number = 9;
            int sum = 9;
            for (int i = 1; i < lengthOfLastNumber; i++) {
                number += 9 * Math.pow(10, i);
                sum = sum + number;
            }
            System.out.println(sum);
        }
    }
}
