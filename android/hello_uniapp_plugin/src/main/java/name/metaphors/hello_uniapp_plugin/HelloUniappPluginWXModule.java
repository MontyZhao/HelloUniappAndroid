package name.metaphors.hello_uniapp_plugin;

import android.app.Activity;
import android.util.Log;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;

public class HelloUniappPluginWXModule extends WXSDKEngine.DestroyableModule {
    private static final String LOG_TAG = "HUPWXModule";

    private JSCallback jsCallback;

    @JSMethod(uiThread = true)
    public void start(JSCallback jsCallback) {
        if (mWXSDKInstance.getContext() instanceof Activity) {
            this.jsCallback = jsCallback;
            Log.d(LOG_TAG, "start");
        }
    }

    @Override
    public void destroy() {
        Log.d(LOG_TAG, "destroy()");
    }
}
