package com.company;

class BankAccount {
    int id;
    double balance;

    double increaseBalance(double balance) {
        this.balance += balance;
        return this.balance;
    }

    double decreaseBalance(double balance) {
        this.balance -= balance;
        return this.balance;
    }
}

class Employee {
    int id;
    String surname;
    int age;
    double salary;
    int department;
    Employee(int id, String surname,
             int age, double salary,
             int department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    void increaseSalary() {
        salary *= 2;
    }
    void salaryInfo() {
        System.out.printf("%2$s salary: %1$.2f", salary, surname);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,
                "Boris", 44,
                560.90, 3);
        Employee e2 = new Employee(2,
                "Ivan", 20,
                55.7, 7);
        e1.increaseSalary();
        e1.salaryInfo();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
