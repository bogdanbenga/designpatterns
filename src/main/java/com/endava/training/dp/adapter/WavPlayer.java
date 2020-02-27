package com.endava.training.dp.adapter;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class WavPlayer implements MediaPlayer {

    public void play(final MediaType mediaType, final String fileName) {
        if (mediaType == MediaType.WAV){
            System.out.println("Playing WAV file: " + fileName);
        } else {
            System.out.println("Invalid file type: " + mediaType);
        }
    }
}
