package com.example.customlistviewexample;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customlistviewexample.R;
import com.example.customlistviewexample.LanguageAdapter;
import com.example.customlistviewexample.Language;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Cá nấu lẩu, nấu mì mini", "Devang"));
        listLanguage.add(new Language(2, "1KG khô gà bơ tỏi","LTD Food"));
        listLanguage.add(new Language(3, "Xe cần cẩu đa năng","Thế giới đồ chơi"));
        listLanguage.add(new Language(4, "Đồ chơi dạng mô hình", "Thế giới đồ chơi"));
        listLanguage.add(new Language(5, "Lãnh đạo giản đơn", "Minh Long Book"));
        listLanguage.add(new Language(6, "Hiểu lòng con trẻ","Minh Long Book"));
        listLanguage.add(new Language(7, "Hiểu lòng con trẻ","Minh Long Book"));

        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);

    }
}