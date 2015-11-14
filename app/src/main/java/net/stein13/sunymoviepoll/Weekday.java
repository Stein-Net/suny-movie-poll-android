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
<<<<<<< HEAD
        url = "https://suny-movie-poll.firebaseio.com/movie-list/" + day + ".json";
       //setData();
    }

    public String getJSON(int timeout) {
        HttpURLConnection c = null;
        try {
            URL u = new URL(url);
            c = (HttpURLConnection) u.openConnection();
            c.setRequestMethod("GET");
            c.setRequestProperty("Content-length", "0");
            c.setUseCaches(false);
            c.setAllowUserInteraction(false);
            c.setConnectTimeout(timeout);
            c.setReadTimeout(timeout);
            c.connect();
            int status = c.getResponseCode();

            switch (status) {
                case 200:
                case 201:
                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line+"\n");
                    }
                    br.close();
                    return sb.toString();
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (c != null) {
                try {
                    c.disconnect();
                } catch (Exception ex) {
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    public void setData() {
        String data = getJSON(50);
        System.out.println(data);

    }
=======
        String url = "https://suny-movie-poll.firebaseio.com/movie-list/" + day + ".json";
       
    }

>>>>>>> origin/master


}
