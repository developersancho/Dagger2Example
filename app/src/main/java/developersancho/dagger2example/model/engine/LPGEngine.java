package developersancho.dagger2example.model.engine;

import android.util.Log;

import developersancho.dagger2example.model.Engine;

public class LPGEngine implements Engine {
    @Override
    public void turnOn() {
        Log.v("DaggerExample", "LPG Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "LPG Engine turned on");
    }
}
