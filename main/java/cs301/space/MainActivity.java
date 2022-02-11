package cs301.space;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Button;

import cs301.space.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SeekBar sbR = (SeekBar) findViewById(R.id.seekBarR);
        SeekBar sbG = (SeekBar) findViewById(R.id.seekBarG);
        SeekBar sbB = (SeekBar) findViewById(R.id.seekBarB);
        Button myButton = (Button) findViewById(R.id.myPlanet);

        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        /*
        int redProgress = sbR.getProgress();
        int greenProgress = sbG.getProgress();
        int blueProgress = sbB.getProgress();
        int myColor = Color.rgb(redProgress, greenProgress, blueProgress);
        myButton.setBackgroundColor(myColor);
*/

    }
}


