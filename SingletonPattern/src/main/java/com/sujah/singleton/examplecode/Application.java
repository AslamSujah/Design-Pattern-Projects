package com.sujah.singleton.examplecode;

import java.sql.Connection;

public class Application {
    public static void main(String[] args) {

        long start;
        long end;

        DBManager dbManager1 = DBManager.getDbManager();
        System.out.println(dbManager1);

        start = System.currentTimeMillis();
        Connection connection1 = dbManager1.getConnection();
        end = System.currentTimeMillis();
        System.out.println(end-start);

        DBManager dbManager2 = DBManager.getDbManager();
        System.out.println(dbManager2);

        start = System.currentTimeMillis();
        Connection connection2 = dbManager2.getConnection();
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
