package com.java.homework_6.task_3;

public class AndroidSmartphone extends Phone {
    private String os;
    private String chargerType;
    private String appstore;

    @Override
    public void setChargerType() {
        chargerType = "Type-c";
    }

    @Override
    public void setOperationSystem() {
        os = "Android";
    }

    @Override
    public void setApplicationStore() {
        appstore = "Play Market";
    }

    public AndroidSmartphone() {
        setChargerType();
        setApplicationStore();
        setOperationSystem();
    }

    public String getOs() {
        return os;
    }

    public String getChargerType() {
        return chargerType;
    }

    public String getAppstore() {
        return appstore;
    }
}
