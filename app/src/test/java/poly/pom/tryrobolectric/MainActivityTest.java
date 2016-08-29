package poly.pom.tryrobolectric;

import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

@RunWith(RobolectricGradleTestRunner.class)
@Config(sdk = 23,constants = BuildConfig.class)
public class MainActivityTest {


    @Test
   public void shouldNotBeNull(){
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(activity);

    }

}