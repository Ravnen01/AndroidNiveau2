package com.lpiem.androidniveau2.Item;

import android.graphics.drawable.Icon;

/**
 * Created by iem2 on 09/11/15.
 */
public class ListViewMenuItem {
    String nom;
    int icon;

    public ListViewMenuItem(String nom, int icon) {
        this.nom = nom;
        this.icon = icon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
