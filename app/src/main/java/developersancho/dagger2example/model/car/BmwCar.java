package developersancho.dagger2example.model.car;

import android.util.Log;

import javax.inject.Inject;

import developersancho.dagger2example.model.Car;
import developersancho.dagger2example.model.Engine;

public class BmwCar implements Car {
    Engine engine;

    // bana engine nesnesini oluştur onu kullanayım.
    @Inject
    public BmwCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample", "BMW Car is about to start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerExample", "BMW Car is about to stop.");
        engine.turnOff();
    }
}
