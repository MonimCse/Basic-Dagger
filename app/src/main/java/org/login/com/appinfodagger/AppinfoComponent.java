package org.login.com.appinfodagger;

import dagger.Component;
import dagger.Module;

@Component( modules = AppinfoModule.class)
public interface AppinfoComponent {

    void inject(MainActivity mainActivity);
    void inject(TestActivity testActivity);

    Appinfo getAppinfo();
}
