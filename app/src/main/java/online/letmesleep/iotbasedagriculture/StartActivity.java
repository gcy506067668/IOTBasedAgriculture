package online.letmesleep.iotbasedagriculture;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.github.florent37.expectanim.ExpectAnim;
import com.github.florent37.expectanim.listener.AnimationEndListener;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.github.florent37.expectanim.core.Expectations.outOfScreen;

public class StartActivity extends AppCompatActivity {


    @BindView(R.id.layout_start_up)
    LinearLayout layoutStartUp;
    @BindView(R.id.layout_start_down)
    LinearLayout layoutStartDown;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
//            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
//        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {        //全屏显示，通知栏背景设置
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        }
        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startAnim();

            }
        }, 3000);
    }

    public void startAnim() {
        new ExpectAnim()
                .expect(layoutStartUp)
                .toBe(
                        outOfScreen(Gravity.TOP)
                )
                .expect(layoutStartDown)
                .toBe(
                        outOfScreen(Gravity.BOTTOM)
                )
                .toAnimation()
                .addEndListener(new AnimationEndListener() {
                    @Override
                    public void onAnimationEnd(ExpectAnim expectAnim) {
                        finish();
                    }
                })
                .setDuration(1500)
                .start();
    }


}
