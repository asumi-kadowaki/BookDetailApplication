package com.example.asumi.bookdetailapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;



public class BookDetailActivity extends AppCompatActivity {

    private BaseAdapter adapter;


    private static final String[] username = {
            // Scenes of Isle of Wight
            "ユーザー名",
            "ユーザー名",
            "ユーザー名",
    };

    private static final String[] evaluation = {
            // Scenes of Isle of Wight
            "評価",
            "評価",
            "評価",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);


        // ListViewのインスタンスを生成
        ListView listViewBookOwner = (ListView) findViewById(R.id.listViewBookOwner);

        // BaseAdapter を継承したadapterのインスタンスを生成

        adapter = new BookDetailListViewAdapter (this.getApplicationContext(), R.layout.part_book_owner, username, evaluation);

        // ListViewにadapterをセット
        listViewBookOwner.setAdapter(adapter);

        // 後で使います
//        listViewBookOwner.setOnItemClickListener(this);



    }
}
