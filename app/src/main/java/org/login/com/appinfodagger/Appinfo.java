package org.login.com.appinfodagger;

import javax.inject.Inject;

public class Appinfo {

    String name;
    String details;
    AppinfoTest appinfoTestOld;
    AppinfoTest appinfoTestNew;

    @Inject
    public Appinfo(@AppinfoName String name, @AppinfoDetails String details, @AppinfoVersionOld AppinfoTest appinfoTestOld, @AppinfoVersionNew AppinfoTest appinfoTestNew) {
        this.name = name;
        this.details = details;
        this.appinfoTestOld = appinfoTestOld;
        this.appinfoTestNew = appinfoTestNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
