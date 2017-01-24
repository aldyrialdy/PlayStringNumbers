package makers.latihan.aldy.playstringnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class FindActivity extends AppCompatActivity {

    ArrayList<Integer> arrNumbers;
    EditText startRange,endRange,indexPos;
    Button btnCheckNum;
    TextView resultIndex;
    int indexVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        startRange = (EditText) findViewById(R.id.editStart);
        endRange = (EditText) findViewById(R.id.editEnd);
        indexPos = (EditText) findViewById(R.id.editIndex);
        btnCheckNum = (Button) findViewById(R.id.btncheckNumber);
        resultIndex = (TextView) findViewById(R.id.textresNum);

        btnCheckNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultIndex.setText("");
                int start = Integer.parseInt(startRange.getText().toString());
                int end = Integer.parseInt(endRange.getText().toString());
                int index = Integer.parseInt(indexPos.getText().toString());
                findNumberIndex(start, end,index);
            }
        });
    }

    private void findNumberIndex(int start, int end, int index) {
        arrNumbers = new ArrayList<Integer>();

        String numConcat = "";
        for(int i=start;i<=end;i++){
            arrNumbers.add(i);
            numConcat= numConcat+String.valueOf(i);
        }
        int lengthChar = numConcat.length();
        char arrkar[] = new char[lengthChar];
        for(int i=0;i<lengthChar;i++){
            arrkar[i] = numConcat.charAt(i);
        }

        indexVal = 0;
        if(String.valueOf(end).length()==1){
            indexVal = arrNumbers.get(index);
        }
        else if(String.valueOf(end).length()==2){
            indexVal = ((index-10)/2)+10;
        }
        resultIndex.setText(arrkar[index]+" is part of "+arrNumbers.get(indexVal));
    }
}
