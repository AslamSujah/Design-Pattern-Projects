package com.sujah.singleton;

public class Application {
    public static void main(String[] args) {

        DBManager dbManager1 = DBManager.getDbManager();
        System.out.println(dbManager1);

        DBManager dbManager2 = DBManager.getDbManager();
        System.out.println(dbManager2);
    }
}
