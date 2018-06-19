package online.letmesleep.iotbasedagriculture;

import android.app.Application;





import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import online.letmesleep.iotbasedagriculture.util.PreferenceUtil;
import online.letmesleep.iotbasedagriculture.util.SoundPoolUtil;


/**
 * Created by Letmesleep on 2018/4/12.
 */

public class MyApplication extends Application {

    private static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        LitePal.initialize(this);
        SoundPoolUtil.initSoundPool(this);


    }


    public static Application getInstance(){
        return application;
    }


}
