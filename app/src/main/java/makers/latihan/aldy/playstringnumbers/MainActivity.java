package makers.latihan.aldy.playstringnumbers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFizz, btnFind, btnGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFizz = (Button) findViewById(R.id.btnFizzBuzz);
        btnFind = (Button) findViewById(R.id.btnFind);
        btnGame = (Button) findViewById(R.id.btnGame);

        btnFizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ifizz = new Intent(MainActivity.this, FizzActivity.class);
                startActivity(ifizz);
            }
        });

        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ifind = new Intent(MainActivity.this, FindActivity.class);
                startActivity(ifind);
            }
        });

        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent igame = new Intent(MainActivity.this, GameActivity.class);
                startActivity(igame);
            }
        });
    }
}
