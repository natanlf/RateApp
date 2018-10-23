package natanlf.com.br.rateapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import natanlf.com.br.rateapp.util.RateDialogManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RateDialogManager.showRateDialog(this, savedInstanceState);
    }
}
