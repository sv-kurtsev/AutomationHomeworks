package com.java.homework_6.task_3;

public class SmartphoneTester {
    public static void main(String[] args) {
        IOSSmartphone iosSmartphone = new IOSSmartphone();
        iosSmartphone.typePhoneNumber();
        System.out.println(iosSmartphone.getOs());
        System.out.println(iosSmartphone.getAppstore());
        System.out.println(iosSmartphone.getChargerType());
        AndroidSmartphone androidSmartphone = new AndroidSmartphone();
        androidSmartphone.typePhoneNumber();
        System.out.println(androidSmartphone.getOs());
        System.out.println(androidSmartphone.getAppstore());
        System.out.println(androidSmartphone.getChargerType());
    }
}
