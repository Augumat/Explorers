package com.waow.rmm.explorers;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioHandler
{
    private static MediaPlayer[] player;
    
    public static void start(Context context, int track)
    {
        if (player == null)
        {
            player = new MediaPlayer[3];
            player[0] = MediaPlayer.create(context, R.raw.intro);
            player[1] = MediaPlayer.create(context, R.raw.welcome);
            player[1].setLooping(true);
            player[2] = MediaPlayer.create(context, R.raw.results);
            player[2].setLooping(true);
        }
        player[track].start();
    }
    
    public static void stop()
    {
        for (MediaPlayer currentTrack: player)
        {
            if (currentTrack.isPlaying())
            {
                currentTrack.stop();
                currentTrack.release();
            }
        }
    }
}
