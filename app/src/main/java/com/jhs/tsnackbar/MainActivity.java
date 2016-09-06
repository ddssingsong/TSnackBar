package com.jhs.tsnackbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jhs.tsnackbar.view.topsnaker.TSnackbar;

/**
 * 需要改动哪些文件
 *
 * 1.com.jhs.tsnackar.view.topsnaker中的所有文件导入
 * 2.xml文件导入
 * 修改TSnackbar里的内容，修改tsnackbar_layout.xml的内容
 *
 */
public class MainActivity extends AppCompatActivity {
    private Button button;
    private RelativeLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        main = (RelativeLayout) findViewById(R.id.main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TSnackbar snackbar = TSnackbar.make(main, "Hello from VSnackBar 1", TSnackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.d("CLICKED Action", "CLIDKED Action");
                            }
                        });

                snackbar.setActionTextColor(Color.WHITE);

                View snackbarView = snackbar.getView();
                TextView textView = (TextView) snackbarView.findViewById(R.id.snackbar_text);
                textView.setTextColor(Color.WHITE);
                snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
                snackbar.show();
            }
        });
    }
}
