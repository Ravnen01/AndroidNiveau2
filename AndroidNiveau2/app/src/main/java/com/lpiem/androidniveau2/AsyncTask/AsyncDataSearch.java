package com.lpiem.androidniveau2.AsyncTask;

import android.os.AsyncTask;
import android.util.Xml;
import android.widget.ListView;

import com.lpiem.androidniveau2.Item.ListViewMenuItem;

import org.xmlpull.v1.XmlPullParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by iem on 01/12/15.
 */
public class AsyncDataSearch extends AsyncTask {

    List<ListViewMenuItem> listItem;
    ListView listView;
    String url="http://lionel.banand.free.fr/lp_iem/updaterLPIEM.php?serial=AAA&type=medias";

    public AsyncDataSearch(List<ListViewMenuItem> listItem, ListView listView) {
        this.listItem = listItem;
        this.listView = listView;
    }

    @Override
    protected Object doInBackground(Object[] params) {
        try {
            URL urlNet=new URL(url);

            HttpURLConnection connection=(HttpURLConnection)urlNet.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String Text=reader.readLine();

            XmlPullParser xmlParser= Xml.newPullParser();
            

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
    }



}
