package com.endava.training.dp.adapter;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class TryMediaAdapter {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(MediaType.MP3, "The Song.mp3");
        audioPlayer.play(MediaType.MP4, "Another Song.mp4");
        audioPlayer.play(MediaType.WAV, "audio1.wav");
        audioPlayer.play(MediaType.M4A, "New Song.m4a");
    }

}
