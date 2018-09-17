package org.login.com.appinfodagger;

import dagger.Module;
import dagger.Provides;

@Module
public class AppinfoModule {


    @Provides
    @AppinfoName
    String name()
    {
        return "Dagger";
    }

    @Provides
    @AppinfoDetails
    String details()
    {
        return "Details of Dagger";
    }
    @Provides
    @AppinfoVersionOld
    AppinfoTest appinfoTestOld()
    {
        return new AppinfoTest(5);
    }
    @Provides
    @AppinfoVersionNew
    AppinfoTest appinfoTestNew()
    {
        return new AppinfoTest(6);
    }
}
