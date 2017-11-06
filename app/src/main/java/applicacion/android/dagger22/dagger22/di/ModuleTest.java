package applicacion.android.dagger22.dagger22.di;

import javax.inject.Named;
import javax.inject.Singleton;

import applicacion.android.dagger22.dagger22.Programmer;
import dagger.Module;
import dagger.Provides;

/**
 * Created by daniel on 5/11/17.
 */

@Module
public class ModuleTest {


    @Named("jotajotavm")
    @Provides
    public Programmer providesProgrammer() {
        return new Programmer("jotajotavm");
    }

    @Named("pedro")
    @Provides
    public Programmer providesProgrammerPedro() {
        return new Programmer("pedro");
    }

    @Singleton
    @Named("none")
    @Provides
    public Programmer providesProgrammerNone() {
        return new Programmer();
    }

    @Provides
    public Company providesCompany(@Named("jotajotavm") Programmer programmer) {
        return new Company(programmer);
    }

}
