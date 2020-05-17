package com.sujah.prototype.myprojectcode;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<EmployeeType, Employee> employees = new HashMap<EmployeeType, Employee>();

    public Registry() {
        this.initialize();
    }

    public Employee getEmployeeType(EmployeeType employeeType){
        Employee employee = null;
        try {
            employee = (Employee) employees.get(employeeType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }


    private void initialize() {

        Doctor doctor = new Doctor();
        doctor.setName("Aslam Sujah");
        doctor.setSalary(85000);
        doctor.setSpecialization("Eye");

        Pharmacist pharmacist = new Pharmacist();
        pharmacist.setName("Ravi");
        pharmacist.setSalary(35000);
        pharmacist.setType("Permanent Staff");

        employees.put(EmployeeType.DOCTOR, doctor);
        employees.put(EmployeeType.PHARMACIST, pharmacist);
    }
}
