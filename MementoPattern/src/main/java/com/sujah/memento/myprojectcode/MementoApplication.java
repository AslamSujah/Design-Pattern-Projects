package com.sujah.memento.myprojectcode;

public class MementoApplication {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Dashboard dashboard = new Dashboard();

        dashboard.addPatient(new Patient(1, "Ravi", 25, "0777123456"));
        dashboard.addPatient(new Patient(2, "Kumara", 41, "0701234567"));

        careTaker.save(dashboard);
        System.out.println(dashboard);

        dashboard.addPatient(new Patient(3, "Mahesh", 37, "0755456789"));
        careTaker.save(dashboard);
        System.out.println(dashboard);

        dashboard.addPatient(new Patient(4, "Shahan", 19, "0788456123"));
        careTaker.save(dashboard);
        System.out.println(dashboard);

        dashboard.addPatient(new Patient(5, "Prasanth", 52, "0727523456"));
        careTaker.save(dashboard);
        System.out.println(dashboard);

        //Revert Code
        careTaker.revert(dashboard);
        System.out.println(dashboard);

        careTaker.revert(dashboard);
        System.out.println(dashboard);

        careTaker.revert(dashboard);
        System.out.println(dashboard);

        careTaker.revert(dashboard);
        System.out.println(dashboard);

        careTaker.revert(dashboard);
        System.out.println(dashboard);

    }
}
