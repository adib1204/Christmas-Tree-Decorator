/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpFacaTon;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Platform;
import javafx.scene.control.MenuItem;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Sound {
    
    
    private static final String MUSIC_DIR = "./src/res/Music/";
    public static final String TAG_COLUMN_NAME = "Tag";
    public static final String VALUE_COLUMN_NAME = "Value";
    public static final List<String> SUPPORTED_FILE_EXTENSIONS = Arrays.asList(".mp3", ".m4a");
    public static final int FILE_EXTENSION_LEN = 3;

    final List<MediaPlayer> players;
    final MediaView mediaView;

    private static Sound song;
    
    public static Sound getInstance()
    {
        if(song==null)
        {
            song = new Sound();
        }
        return song;
    }
    
    private Sound() {
        players = new ArrayList<>();
        getSong();
        mediaView = new MediaView(players.get(0));
        setAutoLoop();
        mediaView.getMediaPlayer().play();

    }

    public void trackSong(MenuItem menu) {
        if ("Pause Music".equals(menu.getText())) {
            mediaView.getMediaPlayer().pause();
            menu.setText("Play Music");
        } else {
            mediaView.getMediaPlayer().play();
            menu.setText("Pause Music");
        }
    }

    public void nextSong() {
        final MediaPlayer curPlayer = mediaView.getMediaPlayer();
        curPlayer.stop();
        MediaPlayer nextPlayer = players.get((players.indexOf(curPlayer) + 1) % players.size());
        mediaView.setMediaPlayer(nextPlayer);
        nextPlayer.play();
    }

    private void getSong() {
        final File dir = new File(MUSIC_DIR);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Cannot find audio source directory: " + dir + " please supply a directory as a command line argument");
        }

        // create some media players. Filter file based on extension
        for (String file : dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                for (String ext : SUPPORTED_FILE_EXTENSIONS) {
                    if (name.endsWith(ext)) {
                        return true;
                    }
                }

                return false;
            }
        })) {
            players.add(createPlayer(new File(MUSIC_DIR + file).toURI().toString()));
        }
    }

    private MediaPlayer createPlayer(String mediaSource) {
        final Media media = new Media(mediaSource);
        final MediaPlayer player = new MediaPlayer(media);
        player.setOnError(new Runnable() {
            @Override
            public void run() {
                System.out.println("Media error occurred: " + player.getError());
            }
        });
        return player;
    }

    private void setAutoLoop() {

        for (int i = 0; i < players.size(); i++) {
            final MediaPlayer player = players.get(i);
            final MediaPlayer nextPlayer = players.get((i + 1) % players.size());
            player.setOnEndOfMedia(new Runnable() {
                @Override
                public void run() {

                    player.stop();
                    mediaView.setMediaPlayer(nextPlayer);
                    nextPlayer.play();
                }

            });
        }
    }

}
