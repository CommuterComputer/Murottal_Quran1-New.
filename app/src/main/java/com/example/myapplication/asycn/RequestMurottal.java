package com.example.myapplication.asycn;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import com.example.myapplication.apis.Constant;
import com.example.myapplication.interfaces.HomeRequest;
import com.example.myapplication.ownmodal.Artist;
import com.example.myapplication.ownmodal.MisharyRashid;
import com.example.myapplication.ownmodal.MuhammadThaha;
import com.example.myapplication.utils.UtilsJson;



public class RequestMurottal extends AsyncTask<String, String, String> {

    HomeRequest homeRequest;
    ArrayList<Artist> artists = new ArrayList<>();
    ArrayList<MisharyRashid> misharyRashids = new ArrayList<>();
    ArrayList<MuhammadThaha> muhammadThahas = new ArrayList<>();

    public RequestMurottal(HomeRequest homeRequest) {
        this.homeRequest = homeRequest;
    }

    @Override
    protected void onPreExecute() {
        homeRequest.onStart();
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... strings) {

        try {
            JSONObject object = new JSONObject(UtilsJson.okHttpGet(strings[0]));
            JSONObject object1 = object.getJSONObject(Constant.TAG_ROOT);

            JSONArray array = object1.getJSONArray("latest_artist");

            for (int i = 0; i < array.length(); i++){

                JSONObject object2 = array.getJSONObject(i);

                String id = object2.getString(Constant.TAG_ID);
                String name = object2.getString(Constant.TAG_ARTIST_NAME);
                String image = object2.getString(Constant.TAG_ARTIST_IMAGE);
                String thumb = object2.getString(Constant.TAG_ARTIST_THUMB);

                Artist artist = new Artist(id, name, image, thumb);
                artists.add(artist);

            }

            return "1";

        } catch (JSONException e) {
            e.printStackTrace();

            return "0";
        }

    }

    @Override
    protected void onPostExecute(String s) {

        super.onPostExecute(s);
    }
}
