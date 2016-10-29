package com.example.ashwin.tabbedlayoutinsidefragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFragmentTabLayout(View view) {
        Fragment fragmentTabLayout = new FragmentTabLayout();
        //Bundle bundle = getIntent().getExtras();
        //mainFragment.setArguments(bundle);
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragmentTabLayout);
        //fragmentTransaction.addToBackStack(this.getClass().getName());
        fragmentTransaction.commit();
    }
}
