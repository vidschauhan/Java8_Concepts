package com.OReilly.functions;

import java.util.function.Predicate;

/**
 * @author vidit.singh
 * @created 05/05/2022 - 11:31
 */
public class PredicateFunction {

    public void getEmployeeBonusAmount(Employee employee,Predicate<Employee> employeePredicate) {
        if (employeePredicate.test(employee)) {
            System.out.println("Eligible for Bonus :: " + 50000);
        } else {
            System.out.println(" No Bonus!");
        }
    }

    public static void main(String[] args) {
        /**
         * Predicate has boolean test() method and takes 1 argument ad returns boolean.
         */
        Employee employee = new Employee(1,5,"Vidit");
        new PredicateFunction().getEmployeeBonusAmount(employee,(emp) -> emp.getRatings() > 4);
    }
}
class Employee{
    int id;
    int ratings;
    String name;

    public Employee(int id, int ratings, String name) {
        this.id = id;
        this.ratings = ratings;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
