package com.example.android.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

import layout.fragment1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void ChangeFragment(View view){
        Fragment fragment;
       if (view==findViewById(R.id.button)){
         fragment = new fragment1();
           FragmentManager fm = getFragmentManager();
           FragmentTransaction ft = fm.beginTransaction();
           ft.replace(R.id.fragments_place,fragment);
           ft.commit();
       }

       if (view==findViewById(R.id.button2)){
           fragment = new Fragment2();
           FragmentManager fm = getFragmentManager();
           FragmentTransaction ft = fm.beginTransaction();
           ft.replace(R.id.fragments_place,fragment);
           ft.commit();
       }
    }

    private class Fragment2 extends Fragment {
    }
}
