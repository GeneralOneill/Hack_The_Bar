package google.mapsapi;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by root on 9/27/15.
 */
public class IntentHandler {

    public static void GoToActivity(View v, Class activity){
        Intent intent = new Intent(v.getContext(), activity);
        v.getContext().startActivity(intent);
    }

    public static void GoToActivity(Context context, Class activity){
        Intent intent = new Intent (context, activity);
        context.startActivity(intent);
    }
}
