package bombey77.motovilov.com.sa106;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myLogs";

    private SecondFragment secondFragment;

    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondFragment = new SecondFragment();

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, secondFragment);
        fragmentTransaction.commit();
    }

    public void onClick(final View view) {

        Log.i(TAG, "onClick");

        Fragment fragment1 = getSupportFragmentManager().findFragmentById(R.id.contFrOne);
        ((TextView) fragment1.getView().findViewById(R.id.tvFrOne)).setText("Set new text fragment one");

        //Fragment fragment2 = getSupportFragmentManager().findFragmentById(R.id.container);
        ((TextView) secondFragment.getView().findViewById(R.id.tvFrTwo)).setText("Set new text fragment two");
    }
}
