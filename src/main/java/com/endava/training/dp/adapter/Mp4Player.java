package com.endava.training.dp.adapter;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class Mp4Player implements MediaPlayer {

    public void play(final MediaType mediaType, final String fileName) {
        if (mediaType == MediaType.MP4){
            System.out.println("Playing MP4 file: " + fileName);
        } else {
            System.out.println("Invalid file type: " + mediaType);
        }
    }
}
