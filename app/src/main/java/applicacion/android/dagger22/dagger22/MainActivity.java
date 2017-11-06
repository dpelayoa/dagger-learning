package applicacion.android.dagger22.dagger22;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.logging.Logger;

import javax.inject.Inject;

import applicacion.android.dagger22.dagger22.di.App;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    @Inject
    Programmer programmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ((App) getApplication()).getComponentTest().inject(this);
        Toast.makeText(this, programmer.toString(),Toast.LENGTH_LONG).show();
    }
}
