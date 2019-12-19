package admin.phuc141.com.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownTimer countDownTimer = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished<2000){
                    this.cancel();
                }
                Log.d("BBB",millisUntilFinished + "");
                Toast.makeText(MainActivity.this, ""+millisUntilFinished, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();
        Log.d("BBB","finish");
    }
}
