package sukuma.uam.mail.pbru.ac.th.funnyquestion.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import sukuma.uam.mail.pbru.ac.th.funnyquestion.R;
import sukuma.uam.mail.pbru.ac.th.funnyquestion.utility.MyConstant;

public class ServiceFragment extends Fragment{

    private int indexAnInt = 0;

    public static ServiceFragment serviceInstance(int index) {
        ServiceFragment serviceFragment = new ServiceFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("Index", index);
        serviceFragment.setArguments(bundle);
        return serviceFragment;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        indexAnInt = getArguments().getInt("Index", 0);

//        Show title
        showTitle();
    }

    private void showTitle() {
        TextView textView = getView().findViewById(R.id.txtShowTitle);
        MyConstant myConstant = new MyConstant();
        String[] strings = myConstant.getUnitTitleString();
        textView.setText(strings[indexAnInt]);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service, container, false);
        return view;
    }
} //MAINCLASS

