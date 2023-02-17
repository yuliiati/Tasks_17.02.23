package org.example;

public class StaffEmployee extends Employee {
    private int term;

    public StaffEmployee(int term, String name, Department department) {
        super(name, department);
        this.term = term;

    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }


}
