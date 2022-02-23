package com.example.isonidos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reproduceSonido(View vista){
        MediaPlayer m = new MediaPlayer();
        int idsonido = R.raw.sonidos_s_no_willyrex;
        m = MediaPlayer.create(this, idsonido);
        m.start();
    }
    public void reproduceVideo(View vista){
        VideoView videoView = findViewById(R.id.video);
        int idvideo = this.getResources().getIdentifier(vista.getTag().toString(), "Raw", this.getPackageName());
        Uri uri = Uri.parse("android.resource://" + getPackageName()+"/" + idvideo);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}