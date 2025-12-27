package keniu;

import java.util.Objects;

public class Song {
    private final String title;
    private final String artist;
    private final long duration;


    public Song(String title, String artist, long duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Song song)) return false;
        return duration == song.duration && Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, duration);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
