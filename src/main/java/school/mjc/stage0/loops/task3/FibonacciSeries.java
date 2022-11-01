package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int previous1 = 0;
        System.out.println(previous1);
        int previous2 = 1;
        System.out.println(previous2);
        int current;
        for (int i = 2; i < lastFibonacci; i++){
            current = previous1 + previous2;
            previous1 = previous2;
            previous2=current;
            System.out.println(current);
        }
    }
}
