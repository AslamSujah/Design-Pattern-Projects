package com.sujah.singleton.myprojectcode;

public class SingletonApplication {
    public static void main(String[] args) {

        ClinicToken Token1 = ClinicToken.getClinicToken();
        System.out.println("Token Number: "+Token1.issueToken());

        ClinicToken Token2 = ClinicToken.getClinicToken();
        System.out.println("Token Number: "+Token2.issueToken());

        ClinicToken Token3 = ClinicToken.getClinicToken();
        System.out.println("Token Number: "+Token3.issueToken());

        ClinicToken Token4 = ClinicToken.getClinicToken();
        System.out.println("Token Number: "+Token4.issueToken());

        ClinicToken Token5 = ClinicToken.getClinicToken();
        System.out.println("Token Number: "+Token5.issueToken());

        ClinicToken Token6 = ClinicToken.getClinicToken();
        System.out.println("Token Number: "+Token6.issueToken());

    }
}
