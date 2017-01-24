package makers.latihan.aldy.playstringnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzActivity extends AppCompatActivity {

    EditText editStart,editEnd;
    Button btnCheck;
    TextView txtResultFizz, txtResultBuzz, txtResultFizzBuzz;
    ArrayList<Integer> arrfizz;
    ArrayList<Integer> arrbuzz;
    ArrayList<Integer> arrfizzbuzz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizz);

        editStart = (EditText) findViewById(R.id.editStart);
        editEnd = (EditText) findViewById(R.id.editEnd);
        btnCheck = (Button) findViewById(R.id.btncheckFizz);
        txtResultFizz = (TextView) findViewById(R.id.textresFizz);
        txtResultBuzz = (TextView) findViewById(R.id.textresBuzz);
        txtResultFizzBuzz = (TextView) findViewById(R.id.textresFizzBuzz);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int start = Integer.valueOf(editStart.getText().toString());
                int end = Integer.valueOf(editEnd.getText().toString());

                countFizzBuzz(start,end);
            }
        });
    }

    private void countFizzBuzz(int start, int end) {
        arrbuzz = new ArrayList<Integer>();
        arrfizz = new ArrayList<Integer>();
        arrfizzbuzz = new ArrayList<Integer>();
        String arrfizz="";
        String arrbuzz="";
        String arrfizzbuzz="";

        for(int i=start;i<end;i++){
            if(i%3==0){
                if(arrfizz.equals("")){
                    arrfizz = String.valueOf(i);
                }
                else{
                    arrfizz = arrfizz+", "+i;
                }
                txtResultFizz.setText("Fizz : "+arrfizz);
            }

            else if(i%5==0){
                if(arrbuzz.equals("")){
                    arrbuzz = String.valueOf(i);
                }
                else{
                    arrbuzz = arrbuzz+", "+i;
                }
                txtResultBuzz.setText("Buzz : "+arrbuzz);
            }
            if((i%5==0) && (i%3==0)){
                if(arrfizzbuzz.equals("")){
                    arrfizzbuzz = String.valueOf(i);
                }
                else{
                    arrfizzbuzz = arrfizzbuzz+", "+i;
                }
                txtResultFizzBuzz.setText("Fizz-Buzz : "+arrfizzbuzz);
            }
        }

    }
}
