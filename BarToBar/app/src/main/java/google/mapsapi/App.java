package google.mapsapi;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by root on 9/26/15.
 */
public class App extends Application{
    public void onCreate(){
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "yI1bjVW9NGCkUzDoX7NNQy4b84pDj89TemvBVkNp", "lhrWMIQD6BWZLIaWkLXN7kefD44zn0qSnVkqrENQ");
    }
}
