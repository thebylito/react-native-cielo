
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNCieloModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCieloModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCielo";
  }

  @ReactMethod
  public void acao(){
    Log.d("RNNA", "OLAAAAA");
  }

}