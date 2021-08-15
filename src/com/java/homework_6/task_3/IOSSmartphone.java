package com.java.homework_6.task_3;

public class IOSSmartphone extends Phone {
    private String os;
    private String chargerType;
    private String appstore;

    @Override
    public void setChargerType() {
        chargerType = "Lightning";
    }

    @Override
    public void setOperationSystem() {
        os = "iOS";
    }

    @Override
    public void setApplicationStore() {
        appstore = "AppStore";
    }

    public IOSSmartphone() {
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
