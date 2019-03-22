package kr.co.woobi.imyeon.transitioninfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TransitionFragment extends Fragment {
    TextView mTextView;
    LinearLayout linearLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transitions, container, false);
        mTextView = view.findViewById(R.id.textView);
        linearLayout=view.findViewById(R.id.fragmentBack);
        if (getArguments() != null) {
            mTextView.setText(getArguments().getString("name"));
            linearLayout.setBackgroundColor(getArguments().getInt("backColor"));
        }
        return view;
    }

    public static TransitionFragment newInstance(String str, int backColor) {
        Bundle args = new Bundle();
        TransitionFragment fragment = new TransitionFragment();
        args.putString("name", str);
        args.putInt("backColor",backColor);
        fragment.setArguments(args);
        return fragment;
    }
}
