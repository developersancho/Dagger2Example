package developersancho.dagger2example.di;

import javax.inject.Singleton;

import dagger.Component;
import developersancho.dagger2example.MainActivity;

// Componentler; Module’lerin sunduğu dependencyler ile diğer sınıfların kullandığı @Inject’lerin arasındaki köprüdür.
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
