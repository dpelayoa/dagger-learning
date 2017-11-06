package applicacion.android.dagger22.dagger22.di;

import applicacion.android.dagger22.dagger22.Programmer;

/**
 * Created by daniel on 5/11/17.
 */

public class Company {
    private Programmer programmer;

    public Company(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Company{");
        sb.append("programmer=").append(programmer);
        sb.append('}');
        return sb.toString();
    }
}
