package poly.pom.tryrobolectric.support;

import org.robolectric.RuntimeEnvironment;

import poly.pom.tryrobolectric.R;

/**
 * Created by User on 29/8/2016.
 */
public class ResourceLocater {
    static public String getString(int StringId){
        return RuntimeEnvironment.application.getString(StringId);
    }
}
