package bombey77.motovilov.com.sa106;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Ромашка on 22.08.2017.
 */

public class FirstFragment extends Fragment {

    protected static final String TAG = "firstFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, null);

        Button button = (Button) view.findViewById(R.id.btnFragmentOne);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "First Fragment");
            }
        });
        return view;
    }
}
