package com.endava.training.dp.adapter;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class MediaAdapter implements MediaPlayer {

    private Mp3Player mp3Player = new Mp3Player();
    private Mp4Player mp4Player = new Mp4Player();
    private WavPlayer wavPlayer = new WavPlayer();


    public void play(final MediaType mediaType, final String fileName) {
        switch (mediaType) {
            case MP3:
                mp3Player.play(mediaType, fileName);
                break;
            case MP4:
                mp4Player.play(mediaType, fileName);
                break;
            case WAV:
                wavPlayer.play(mediaType, fileName);
                break;
            default:
                System.out.println("Unsupported operation. Cannot play " + fileName);
        }
    }
}
