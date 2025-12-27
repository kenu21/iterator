package keniu;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Song auslander = new Song("Auslander", "Rammstein", 5);
        playlist.addSong(auslander);
        playlist.addSong(new Song("Storytime", "Nightwish", 3));
        playlist.addSong(new Song("Feuer Frei", "Rammstein", 4));
        SongIterator songIterator = playlist.createIterator();

        while (songIterator.hasNext()) {
            System.out.println(songIterator.next());
        }

        System.out.println();

        playlist.removeSong(auslander);
        songIterator = playlist.createIterator();

        while (songIterator.hasNext()) {
            System.out.println(songIterator.next());
        }
    }
}
