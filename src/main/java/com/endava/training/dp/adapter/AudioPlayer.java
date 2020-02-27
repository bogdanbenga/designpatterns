package com.endava.training.dp.adapter;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter = new MediaAdapter();

    public void play(final MediaType mediaType, final String fileName) {
        mediaAdapter.play(mediaType, fileName);
    }
}
