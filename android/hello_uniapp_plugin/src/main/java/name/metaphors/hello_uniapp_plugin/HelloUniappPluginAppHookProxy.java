package name.metaphors.hello_uniapp_plugin;

import android.app.Application;
import android.util.Log;

import io.dcloud.weex.AppHookProxy;

public class HelloUniappPluginAppHookProxy implements AppHookProxy {
    private static final String LOG_TAG = "HUPAppHookProxy";

    @Override
    public void onCreate(Application application) {
        Log.d(LOG_TAG, "onCreate()");
    }
}
