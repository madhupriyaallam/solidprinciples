package SolidPrinciplesNew.DIP.Follow;

import java.util.HashMap;

public class Associate implements NewEmployee{
    String empId,empName;
    int experience;
    public Associate(String empId, String empName, int experience){
        this.empId = empId;
        this.empName = empName;
        this.experience = experience;

    }
    public void addEmployee(HashMap<String, Integer> employees){
        employees.put(this.empName,this.experience);
        System.out.println("New Associate Engineer "+empName+" joined with an experience of "+experience);
    }
}
