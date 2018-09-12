
package com.thebylito;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import java.util.Map;

import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNCieloManager extends SimpleViewManager<View> {
    private ThemedReactContext mContext = null;
    private Activity mActivity = null;

    public static final String REACT_CLASS = "RNCieloManager";
    public static final int NAME = 1;
    public static final int NAME2 = 2;

    @Override
    public String getName() {
        // Tell React the name of the module
        // https://facebook.github.io/react-native/docs/native-components-android.html#1-create-the-viewmanager-subclass
        return REACT_CLASS;
    }

    @Override
    public View createViewInstance(ThemedReactContext reactContext) {
        mContext = reactContext;
        mActivity = mContext.getCurrentActivity();
        return new View(mContext);
    }

    @ReactProp(name = "prop")
    public void methodProp(View view, String prop) {

    }

    @Override
    public Map<String, Integer> getCommandsMap() {
         Log.d("React", " View manager getCommandsMap:");
        return MapBuilder.of("name", NAME, "name2", NAME2);
    }

    @Override
    public void receiveCommand(View view, int commandType, @Nullable ReadableArray args) {
        Assertions.assertNotNull(view);
        Assertions.assertNotNull(args);
        switch (commandType) {
        case NAME: {
            // action()
            return;
        }
        case NAME2: {
            // action()
            return;
        }

        default:
            throw new IllegalArgumentException(
                    String.format("Unsupported command %d received by %s.", commandType, getClass().getSimpleName()));
        }
    }
}