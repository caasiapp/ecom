package com.example.demo.Services;

import java.util.Calendar;

public class ErDetFredag {
    public String erDetFredagUdregner() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        String answer = "";
        switch (dayOfWeek) {
            case 1:
                answer = "Nej, det er mandag.";
                break;
            case 2:
                answer = "Nej, det er tirsdag.";
                break;
            case 3:
                answer = "Nej, det er onsdag.";
                break;
            case 4:
                answer = "Nej, det er torsdag.";
                break;
            case 5:
                answer = "JA, DET ER FREDAG!!!";
                break;
            case 6:
                answer = "Nej, det er lørdag.";
                break;
            case 7:
                answer = "Nej, det er søndag.";
                break;
        } return answer;
    } 
}
