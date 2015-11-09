package com.lpiem.androidniveau2;

import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.lpiem.androidniveau2.Adapter.ListViewMenuAdapter;
import com.lpiem.androidniveau2.Fragment.MediaFragment;
import com.lpiem.androidniveau2.Item.ListViewMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<ListViewMenuItem> listItemMenu=new ArrayList<>();
    private DrawerLayout drawerLayout;
    private ListView lvMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listItemMenu.add(new ListViewMenuItem("Image", R.drawable.ic_action_image));
        listItemMenu.add(new ListViewMenuItem("Text", R.drawable.ic_action_text));
        listItemMenu.add(new ListViewMenuItem("Video",R.drawable.ic_action_name));
        drawerLayout=(DrawerLayout) findViewById(R.id.dlMainActivity);
        lvMenu=(ListView)findViewById(R.id.lvMenu);

        lvMenu.setAdapter(new ListViewMenuAdapter(listItemMenu,getApplicationContext()));

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment=null;
                    switch (position){
                        case 0:
                            fragment=new MediaFragment();
                            break;
                        case 1:
                            fragment=new MediaFragment();
                            break;

                        case 2:
                            fragment=new MediaFragment();
                            break;

                        default:
                            break;
                    }
                //display the appropriate view with a transition
                if(fragment != null) {
                    getFragmentManager().beginTransaction().replace(R.id.flMainActivity, fragment).commit();
                    //set the selected item to the drawer
                    lvMenu.setItemChecked(position, true);
                    lvMenu.setSelection(position);
                    setTitle(listItemMenu.get(position).getNom());
                    drawerLayout.closeDrawers();
                }

            }

        });




    }
}
