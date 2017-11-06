package applicacion.android.dagger22.dagger22.di;

import applicacion.android.dagger22.dagger22.Programmer;
import dagger.Module;
import dagger.Provides;

/**
 * Created by daniel on 5/11/17.
 */

@Module
public class ModuleTest {

    @Provides
    public Programmer providesProgrammer() {
        return new Programmer("jotajotavm");
    }
}
