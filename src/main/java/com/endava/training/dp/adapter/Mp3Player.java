package com.endava.training.dp.adapter;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Mp3Player implements MediaPlayer {

    public void play(final MediaType mediaType, final String fileName) {
        if (mediaType == MediaType.MP3){
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            System.out.println("Invalid file type: " + mediaType);
        }
    }
}
