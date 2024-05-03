package Project;

public class Employee {

    String posCode,empName, depCode, empPos;
    //int posCode;
    double hoursWorked, regPay, otPay, netPay;
    //deduction;

    Employee(String posCode, String depCode, String empName, String empPos, double hoursWorked, double regPay, double otPay, double netPay){
        this.posCode = posCode;
        this.depCode = depCode;
        this.empName = empName;
        this.empPos = empPos;
        this.hoursWorked = hoursWorked;
        this.regPay = regPay;
        this.otPay = otPay;
        this.netPay = netPay;
        //this.deduction = deduction;
    }
}
