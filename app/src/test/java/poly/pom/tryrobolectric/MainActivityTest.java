package poly.pom.tryrobolectric;

import android.os.Build;
import android.view.View;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import poly.pom.tryrobolectric.support.ResourceLocater;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static poly.pom.tryrobolectric.support.ResourceLocater.getString;

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

        assertThat(activity.getTitle().toString(),equalTo(RuntimeEnvironment.application.getString(R.string.app_name)));

    }

    @Test
    public void shouldHaveWelcomeTest() throws Exception {

        TextView tvHello = (TextView)activity.findViewById(R.id.tvHello);
        assertNotNull(tvHello);
//        should visible
        assertThat(tvHello.getVisibility(),equalTo(View.VISIBLE));
//        should show the reight world
        assertThat(tvHello.getText().toString(),equalTo(RuntimeEnvironment.application.getString(R.string.hello)));

    }
}