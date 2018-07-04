package com.acadview.thirdappjava;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast toast = Toast.makeText(MainActivity2.this, "Inside onCreate", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        Intent intent = new Intent(MainActivity2.this, MainActivity2.class);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(MainActivity2.this,"Inside onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(MainActivity2.this,"Inside onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(MainActivity2.this,"Inside onResume",Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(MainActivity2.this, "", Toast.LENGTH_LONG).show();
    }
    @Override
protected void onDestroy() {
    super.onDestroy();

    Toast.makeText(MainActivity2.this,"Inside onDestroy",Toast.LENGTH_LONG).show();
}

}

