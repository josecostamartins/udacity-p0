package br.com.digitaldreams.portfolioapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final Context mContext = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        if (view.getId() == R.id.popular_movies){
            Toast.makeText(mContext, "This is my \"Popular Movies\" App", Toast.LENGTH_LONG).show();
        }
        if (view.getId() == R.id.stock_hawk){
            Toast.makeText(mContext, "This is my \"Stock Hawk\" App", Toast.LENGTH_LONG).show();
        }
        if (view.getId() == R.id.build_it_bigger){
            Toast.makeText(mContext, "This is my \"Built It Bigger\" App", Toast.LENGTH_LONG).show();
        }
        if (view.getId() == R.id.make_your_app_material){
            Toast.makeText(mContext, "This is my \"Make Your App Material\" App", Toast.LENGTH_LONG).show();
        }
        if (view.getId() == R.id.go_ubiquitous){
            Toast.makeText(mContext, "This is my \"Go Ubiquitous\" App", Toast.LENGTH_LONG).show();
        }
        if (view.getId() == R.id.capstone){
            Toast.makeText(mContext, "This is my \"Capstone\" App", Toast.LENGTH_LONG).show();
        }

    }
}
