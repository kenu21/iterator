package keniu;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Playlist implements SongCollection {
    private List<Song> songs = new ArrayList<>();

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public SongIterator createIterator() {
        return new PlaylistIterator();
    }

    private class PlaylistIterator implements SongIterator {
        private int index = 0;

        private PlaylistIterator() {
        }

        @Override
        public boolean hasNext() {
            return index < songs.size();
        }

        @Override
        public Song next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return songs.get(index++);
        }
    }
}
