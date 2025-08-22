//Encapsulation

class Employee {
    private double  salary;

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary){
        if(newSalary > 0){
            this.salary = newSalary;
        }else{
            System.out.println("Error: Salary must be greater than zero");
        }
    }
}

public class Company{
    public static void main(String[] args){
        Employee emp = new Employee();

        System.out.println("Setting salary to 50000...");
        emp.setSalary(50000);

        System.out.println("Employee's salary " + emp.getSalary());

        System.out.print("\nAttempting to set salary to -1000....");
        emp.setSalary(-1000);
        
        System.out.println("Employee's salary is still: " + emp.getSalary());
    }
}