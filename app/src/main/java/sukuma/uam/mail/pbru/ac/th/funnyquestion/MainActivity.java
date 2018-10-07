package sukuma.uam.mail.pbru.ac.th.funnyquestion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sukuma.uam.mail.pbru.ac.th.funnyquestion.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainFragent, new MainFragment()).commit();
        }
    }


}
