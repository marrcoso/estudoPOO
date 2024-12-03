package entities;

public class Worker {
    private String name;
    private double salary;
    private double tax;

    public double netSalary(){
        return salary += tax;
    }

    public void increaseSalary(double percentage){
        salary += percentage/100*salary;
    } 
}
