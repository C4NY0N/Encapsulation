package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee farah = new Employee(1000000);

        // Salary has private access

        System.out.println(farah.getSalary());

        farah.setSalary(1100000);

        System.out.println(farah.getSalary());

    }
}
