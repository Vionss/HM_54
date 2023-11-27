package ait.employee.model;

public abstract class Employee {
    protected static double minWage = 13;
    protected final int id;
    protected String firstName;
    protected String lastname;
    protected double hours;

    public Employee(int id, String firstName, String lastname, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.hours = hours;
    }

    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        if (minWage > Employee.minWage) {
            Employee.minWage = minWage;
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public abstract double calcSalary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee ");
        sb.append(" id = ").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary = ").append(calcSalary());
        return sb.toString();
    }


}
