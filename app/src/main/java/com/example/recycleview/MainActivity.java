package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList <info_class> info_classArrayList;
mtadapter myadapter;
String []info_heading;
    String []info_Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         recyclerView.setHasFixedSize(true);

         info_classArrayList = new ArrayList<info_class>();

         myadapter = new mtadapter(this,info_classArrayList);
recyclerView.setAdapter(myadapter);
         info_heading = new String[]{
                 "helo kavi",
                 "hellooo",
                 "how are you",
                 "welcom",
                 "are you happt",
                 "helo kavi",
                 "hellooo",
                 "how are you",
                 "welcom",
                 "are you happt",
                 "helo kavi",
                 "hellooo",
                 "how are you",
                 "welcom",
                 "are you happt"
         };

        info_Text = new String[]{
                "hedlo kavi",
                "helddddlooo",
                "howddd are you",
                "weldddcom",
                "arddde you happt",
                "heddlo kavi",
                "heddllooo",
                "hodddw are you",
                "wedddlcom",
                "ardde you happt",
                "heddlo kavi",
                "hedddllooo",
                "hodddw are you",
                "wdddelcom",
                "are yoddu happt"
        };

         getDate();
    }

    private void getDate() {
        for (int i = 0; i<info_heading.length;i++){

            info_class info_class=new info_class(info_heading[i],info_Text[i]);
            info_classArrayList.add(info_class);
        }
        myadapter.notifyDataSetChanged();
    }
}
