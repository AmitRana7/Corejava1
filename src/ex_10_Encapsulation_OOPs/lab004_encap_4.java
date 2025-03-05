package ex_10_Encapsulation_OOPs;

public class lab004_encap_4 {
    public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.empName = "Ashish";
    e1.empId = 2025;
    e1.salary = 100;
        System.out.println(e1.empName);
        System.out.println(e1.empId);
        System.out.println(e1.salary);

        e1.setEmpName("Amit");
        e1.setEmpId(2026);
        e1.setSalary(200);
        System.out.println("Employee Name :"  + e1.getEmpName());
        System.out.println("Employee Name :"  + e1.getEmpId());
        System.out.println("Employee Name :"  + e1.getSalary());



    }
}
class Employee{
    String empName;
    int empId;
    double salary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}