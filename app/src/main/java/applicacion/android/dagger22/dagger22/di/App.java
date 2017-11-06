package applicacion.android.dagger22.dagger22.di;

import android.app.Application;

import dagger.Component;

/**
 * Created by daniel on 5/11/17.
 */

public class App extends Application {

    private ComponentTest componentTest;

    @Override
    public void onCreate() {
        super.onCreate();
        componentTest = DaggerComponentTest.builder().moduleTest(new ModuleTest()).build();
    }

    public ComponentTest getComponentTest() {
        return componentTest;
    }
}
