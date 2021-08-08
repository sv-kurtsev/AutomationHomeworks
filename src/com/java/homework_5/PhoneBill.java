package com.java.homework_5;

public class PhoneBill {
    double internetTraffic;
    int minutesInUkraine;
    int sms;
    int minutesZone1;
    int minutesZone2;
    private double phoneBill;

    public PhoneBill(double internetTraffic, int minutesInUkraine, int sms, int minutesZone1, int minutesZone2) {
        this.internetTraffic = internetTraffic;
        this.minutesInUkraine = minutesInUkraine;
        this.sms = sms;
        this.minutesZone1 = minutesZone1;
        this.minutesZone2 = minutesZone2;
        this.phoneBill = setPhoneBill(internetTraffic, minutesInUkraine, sms, minutesZone1, minutesZone2) + setPhoneBill(internetTraffic, minutesInUkraine, sms, minutesZone1, minutesZone2) * 0.07;
    }

    double calculateInternet(double usedTraffic) {
        if (usedTraffic <= 8) {
            return 0;
        } else {
            return (usedTraffic - 8) * 100;
        }
    }

    double calculateCallsInUkraine(int minutes) {
        if (minutes <= 500) {
            return minutes * 0.5;
        } else {
            return (500 * 0.5) + ((minutes - 500) * 0.75);
        }
    }

    double calculateSMS(int SMS) {
        if (SMS <= 50) {
            return SMS;
        } else {
            return SMS + (SMS - 50) * 1.5;
        }
    }

    double calculateCallsZone1(int minutes) {
        return minutes * 1.5;
    }

    double calculateCallsZone2(int minutes) {
        return minutes * 2;
    }

    double setPhoneBill(double internetTraffic, int minutesInUkraine, int sms, int minutesZone1, int minutesZone2) {
        return calculateInternet(internetTraffic) + calculateCallsInUkraine(minutesInUkraine) + calculateSMS(sms) + calculateCallsZone1(minutesZone1) + calculateCallsZone2(minutesZone2);
    }

    public double getPhoneBill() {
        return phoneBill;
    }
}
