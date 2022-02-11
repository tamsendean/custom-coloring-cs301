package cs301.space;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.graphics.*;

public class SpaceView extends SurfaceView {

    // Planet object
    private Planet Planet = new Planet();

    // getter method
    public Planet getPlanet() {
        return Planet;
    }

    public SpaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}//class SpaceView

