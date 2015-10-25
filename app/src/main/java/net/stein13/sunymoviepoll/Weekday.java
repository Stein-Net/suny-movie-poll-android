package net.stein13.sunymoviepoll;


import android.app.DownloadManager;

import org.json.JSONObject;

/**
 * Created by gregory on 10/24/15.
 */
public class Weekday {
    private String day;
    private String movies[] = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6"};
    private int votes[] = {0,0,0,0,0,0};
    public Weekday(String day1){
        day = day1;
        String url = "https://suny-movie-poll.firebaseio.com/movie-list/" + day + ".json";
       
    }



}
