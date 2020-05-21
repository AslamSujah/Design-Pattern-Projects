package com.sujah.memento.myprojectcode;

import java.util.ArrayList;

public class Dashboard {

    ArrayList<Patient> patients = new ArrayList<Patient>();

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public ArrayList<Patient> getPatients() {
        return (ArrayList<Patient>) patients.clone();
    }

    public DashboardMemento save(){
        return new DashboardMemento(getPatients());
    }

    public void revert(DashboardMemento dashboardMemento){
        patients = dashboardMemento.getPatients();
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "patients=" + patients +
                '}';
    }

    static class DashboardMemento{
        ArrayList<Patient> patients;

        public DashboardMemento(ArrayList<Patient> patients) {
            this.patients = patients;
        }

        public ArrayList<Patient> getPatients() {
            return patients;
        }
    }

}
