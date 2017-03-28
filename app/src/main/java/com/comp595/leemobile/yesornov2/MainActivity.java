package com.comp595.leemobile.yesornov2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.opencv.android.OpenCVLoader;
import org.opencv.core.Mat;

public class MainActivity extends AppCompatActivity {

    private static final String myTag="MainActivity";

    // Used to load the 'native-lib' library on application startup.
    static {
        if(OpenCVLoader.initDebug())
        {
            Log.d(myTag, "OpenCV successfully loaded!  woot woot.");
        }
        else
        {
            Log.d(myTag, "OpenCV has not been loaded!");
        }



        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);










        Mat myMat;

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText("EYYYYYYY WATTUP!");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
