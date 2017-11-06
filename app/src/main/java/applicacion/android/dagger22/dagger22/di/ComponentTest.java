package applicacion.android.dagger22.dagger22.di;

import applicacion.android.dagger22.dagger22.MainActivity;
import dagger.Component;

/**
 * Created by daniel on 5/11/17.
 */
@Component(modules = {
        ModuleTest.class
})
public interface ComponentTest {
    void inject(MainActivity mainActivity);
}
