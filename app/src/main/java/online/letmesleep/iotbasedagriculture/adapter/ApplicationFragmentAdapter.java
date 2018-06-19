package online.letmesleep.iotbasedagriculture.adapter;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.kyleduo.switchbutton.SwitchButton;

import java.util.List;

import online.letmesleep.iotbasedagriculture.R;


/**
 * Created by Letmesleep on 2018/4/22.
 */

public class ApplicationFragmentAdapter extends BaseQuickAdapter<String,BaseViewHolder> {


    public ApplicationFragmentAdapter(@Nullable List<String> data) {
        super(R.layout.adapter_application_fragment, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }
}
