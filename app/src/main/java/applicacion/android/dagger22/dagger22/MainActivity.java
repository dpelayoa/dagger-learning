package applicacion.android.dagger22.dagger22;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

import applicacion.android.dagger22.dagger22.di.App;
import applicacion.android.dagger22.dagger22.di.Company;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    @Named("jotajotavm") @Inject Programmer programmer;
    @Named("pedro") @Inject Programmer programmer2;
    @Named("none") @Inject Programmer programmer3;
    @Named("none") @Inject Programmer programmer4;

    @Inject Company company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ((App) getApplication()).getComponentTest().inject(this);
        Toast.makeText(this, programmer.toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, programmer2.toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, programmer3.toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, programmer4.toString(), Toast.LENGTH_LONG).show();

        Toast.makeText(this, company.toString(), Toast.LENGTH_LONG).show();
    }
}
