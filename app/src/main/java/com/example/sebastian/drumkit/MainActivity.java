package com.example.sebastian.drumkit;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 9;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mBoomSoundId;
    private int mClapSoundId;
    private int mHihatSoundId;
    private int mKickSoundId;
    private int mOpenhatSoundId;
    private int mRideSoundId;
    private int mSnareSoundId;
    private int mTinkSoundId;
    private int mTomSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        mBoomSoundId = mSoundPool.load(getApplicationContext(), R.raw.boom,1);
        mClapSoundId = mSoundPool.load(getApplicationContext(), R.raw.clap, 1);
        mHihatSoundId = mSoundPool.load(getApplicationContext(), R.raw.hihat, 1);
        mKickSoundId = mSoundPool.load(getApplicationContext(), R.raw.kick, 1);
        mOpenhatSoundId = mSoundPool.load(getApplicationContext(), R.raw.openhat, 1);
        mRideSoundId = mSoundPool.load(getApplicationContext(), R.raw.ride, 1);
        mSnareSoundId = mSoundPool.load(getApplicationContext(), R.raw.snare, 1);
        mTinkSoundId = mSoundPool.load(getApplicationContext(), R.raw.tink, 1);
        mTomSoundId = mSoundPool.load(getApplicationContext(), R.raw.tom, 1);

    }

    public void playBoom(View v){
        mSoundPool.play(mBoomSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playClap(View v){
        mSoundPool.play(mClapSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playHihat(View v){
        mSoundPool.play(mHihatSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playKick(View v){
        mSoundPool.play(mKickSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playOpenhat(View v){
        mSoundPool.play(mOpenhatSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playRide(View v){
        mSoundPool.play(mRideSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playSnare(View v){
        mSoundPool.play(mSnareSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playTink(View v){
        mSoundPool.play(mTinkSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playTom(View v){
        mSoundPool.play(mTomSoundId, LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}
