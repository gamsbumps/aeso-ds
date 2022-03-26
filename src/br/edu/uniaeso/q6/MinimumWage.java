package br.edu.uniaeso.q6;

public class MinimumWage {
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public MinimumWage(float salary) {
        setSalary(salary);
    }

    public MinimumWage() {
        setSalary(0);
    }
}
