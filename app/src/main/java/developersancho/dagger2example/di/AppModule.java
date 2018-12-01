package developersancho.dagger2example.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import developersancho.dagger2example.Dagger2Application;
import developersancho.dagger2example.model.Car;
import developersancho.dagger2example.model.Engine;
import developersancho.dagger2example.model.car.BmwCar;
import developersancho.dagger2example.model.car.MercedesCar;
import developersancho.dagger2example.model.engine.BenzinEngine;
import developersancho.dagger2example.model.engine.LPGEngine;

@Module
public class AppModule {
    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application) {
        this.dagger2Application = dagger2Application;
    }

    @Provides
    @Singleton
    Dagger2Application provideApp() {
        return dagger2Application;
    }

    // engine lazım onu sağlamak için
    @Provides
    @Singleton
    Engine provideEngine() {
        return new LPGEngine();
    }

    @Provides
    @Singleton
    Car provideCar(Engine engine) {
        return new MercedesCar(engine);
    }
}
