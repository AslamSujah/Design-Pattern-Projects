package com.sujah.singleton;

public class DBManager {

    private static volatile DBManager dbManager; //= new DBManager();

    private DBManager(){
        //Avoid reflection framework to avoid singleton destroy.
        if (dbManager != null){
            throw new RuntimeException("Please use the getDbManager() method");
        }

    }

    public static DBManager getDbManager() {
        if (dbManager == null){
            synchronized (DBManager.class){
                if (dbManager == null){
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }
}
