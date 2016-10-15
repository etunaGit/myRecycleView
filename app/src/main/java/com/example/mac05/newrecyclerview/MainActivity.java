package com.example.mac05.newrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView1;
    private ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 =(RecyclerView) findViewById(R.id.recyclerView1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        fillContacts();
        recyclerView1.setAdapter(new ContactAdapter());

    }


    private void fillContacts() {
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
    }
}
