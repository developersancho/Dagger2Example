package developersancho.dagger2example.model.car;

import android.util.Log;

import javax.inject.Inject;

import developersancho.dagger2example.model.Car;
import developersancho.dagger2example.model.Engine;

public class MercedesCar implements Car {

    Engine engine;

    // Engine nesnesi oluştur kullanak...
    @Inject
    public MercedesCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample", "Mercedes Car is about to start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerExample", "Mercedes Car is about to stop.");
        engine.turnOff();
    }
}
