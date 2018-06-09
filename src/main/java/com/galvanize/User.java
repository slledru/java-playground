package com.galvanize;

class User implements Comparable, Cloneable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public boolean isComparable(Object o) {
        return o instanceof Comparable;
    }
}

class Employee extends User {
    public boolean isEmployee(Object o) {
        return o instanceof Employee;
    }
}

class Manager extends Employee {
    public boolean isManager(Object o) {
        return o instanceof Manager;
    }
 }

class Customer extends User {
    public boolean isCustomer(Object o) {
        return o instanceof Customer;
    }
}