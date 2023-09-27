package org.example;

public class Main {
    public static void main(String[] args) {

        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();
        Count count4 = new Count();

        count1.incrementInstanceCount();
        count1.incrementInstanceCount();

        count2.incrementInstanceCount();
        count2.incrementInstanceCount();
        count2.incrementInstanceCount();
        count2.incrementInstanceCount();

        count3.incrementInstanceCount();

        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();

        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);

        System.out.println("\n");
        System.out.println(Calculator.add(2.56,3.34));
        System.out.println(Calculator.sub(2.56,3.34));
        System.out.println(Calculator.multiplication(2.56,3.34));
        System.out.println(Calculator.division(2.56,3.34));
    }
}