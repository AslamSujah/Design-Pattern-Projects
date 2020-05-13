package com.sujah.singleton.myprojectcode;

public class ClinicToken {

    private static volatile ClinicToken clinicToken;

    private int tokenStart;
    private int numberOfTokens;

    private ClinicToken(){
        this.tokenStart = 1000;
        this.numberOfTokens = 5;
    }

    public static ClinicToken getClinicToken() {
        if (clinicToken == null){
            synchronized (ClinicToken.class){
                if (clinicToken == null){
                    clinicToken = new ClinicToken();
                }
            }
        }
        return clinicToken;
    }

    public int issueToken(){
        if(clinicToken.numberOfTokens > 0){
            clinicToken.tokenStart += 1;
            clinicToken.numberOfTokens -= 1;
            return clinicToken.tokenStart;
        }
        else {
            return 0;
        }
    }
}
