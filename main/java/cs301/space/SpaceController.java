package cs301.space;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class SpaceController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener {

    private SpaceView spaceView;
    private Planet Planet;

    public SpaceController(SpaceView SpaceView) {
        this.spaceView = SpaceView;
        this.Planet = SpaceView.getPlanet();
    }

    @Override
    public void onClick(View view) {
        this.Planet.clicked = true;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(!fromUser) return;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {}
}
