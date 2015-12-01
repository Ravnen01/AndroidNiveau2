package com.lpiem.androidniveau2.Manager;

import com.lpiem.androidniveau2.Enumerateur.TypeData;
import com.lpiem.androidniveau2.Model.MediaObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 01/12/15.
 */
public class MediaManager {
    private List<MediaObject> mediaObjectList;
    private static MediaManager ourInstance = new MediaManager();

    public static MediaManager getInstance() {
        return ourInstance;
    }

    private MediaManager() {
        mediaObjectList=new ArrayList<>();

    }

    public void addMedia(MediaObject mediaObject){
        mediaObjectList.add(mediaObject);
    }
    public void addMedia(List<MediaObject> listMediaObject){
        for(int i=0;i<listMediaObject.size();i++){
            mediaObjectList.add(listMediaObject.get(i));
        }
    }

    public ArrayList<MediaObject> getListMedia(TypeData type){
        ArrayList<MediaObject> listMediaObject=new ArrayList<>();
        for(int i=0;i<mediaObjectList.size();i++){
            if(mediaObjectList.get(i).type==type){
                listMediaObject.add(mediaObjectList.get(i));
            }
        }
        return listMediaObject;
    }



}
