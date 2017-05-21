package com.example.demo;

import com.wxcily.xunplayer.player.ui.VideoActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;


public class MainActivity extends Activity {
	EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.edittext);
        findViewById(R.id.button).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String url=editText.getText().toString();
				String[] urls=new String[] {url};
				Intent intent=new Intent(MainActivity.this,VideoActivity.class);
				intent.putExtra("video_path", urls);
				intent.putExtra("video_name", "百元哥");
				MainActivity.this.startActivity(intent);
			}
		});
    }

}
