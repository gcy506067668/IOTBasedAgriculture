package online.letmesleep.iotbasedagriculture.fragments;


import android.os.Bundle;

import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;


import online.letmesleep.iotbasedagriculture.R;



/***
 * 灯  Fragment
 */
public class ControlFragment extends BaseFragment implements BaseQuickAdapter.OnItemChildClickListener {




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_control, container, false);

        return v;
    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

    }
}
