package applicacion.android.dagger22.dagger22.di;

import javax.inject.Singleton;

import applicacion.android.dagger22.dagger22.MainActivity;
import dagger.Component;

/**
 * Created by daniel on 5/11/17.
 */

@PerActivity
@Singleton
@Component(modules = {
        ModuleTest.class
})
public interface ComponentTest {
    void inject(MainActivity mainActivity);
}
