package bombey77.motovilov.com.sa106;

import android.app.Activity;
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

public class SecondFragment extends Fragment {

    protected static final String TAG = "secondFragment";

    public interface SomeInventLister {
        void someText(String s);

    }

    SomeInventLister someInventLister;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            someInventLister = (SomeInventLister) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException (activity.toString() + " you should implement method ...");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, null);

        Button button = (Button) view.findViewById(R.id.btnFragmentTwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Second Fragment");

                someInventLister.someText(" text from fr two");
            }
        });

        return view;
    }
}
