package online.letmesleep.iotbasedagriculture.adapter;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.kyleduo.switchbutton.SwitchButton;

import java.util.List;

import online.letmesleep.iotbasedagriculture.R;


/**
 * Created by Letmesleep on 2018/4/22.
 */

public class LightFragmentAdapter extends BaseQuickAdapter<String,BaseViewHolder> {

    private List<String> data ;

    public LightFragmentAdapter(@Nullable List<String> data) {
        super(R.layout.adapter_light_fragment, data);
        this.data = data;
    }

    @Override
    protected void convert(final BaseViewHolder helper, final String item) {

    }

}
