package developersancho.dagger2example;

import android.app.Application;

import developersancho.dagger2example.di.AppComponent;
import developersancho.dagger2example.di.AppModule;
import developersancho.dagger2example.di.DaggerAppComponent;

public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
