package keniu;

public interface SongCollection {
    void addSong(Song song);

    void removeSong(Song song);

    SongIterator createIterator();
}
