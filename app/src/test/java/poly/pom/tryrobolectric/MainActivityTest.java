package poly.pom.tryrobolectric;

import android.os.Build;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

@RunWith(RobolectricGradleTestRunner.class)
@Config(sdk = 22,constants = BuildConfig.class)
public class MainActivityTest {


    private MainActivity activity;

    @Before
    public void setUp() throws Exception {

         activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
   public void shouldNotBeNull(){
        
        assertNotNull(activity);

    }

    @Test
    public void shouldHaveTitle() throws Exception {
        assertTrue(activity.getTitle().toString().equals(RuntimeEnvironment.application.getString(R.string.app_name)));

    }
}