package makers.latihan.aldy.playstringnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    EditText insertNumber;
    Button btnResultGame;
    TextView result1, result2;
    int curNumber;
    String strCur;
    String addSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        insertNumber = (EditText) findViewById(R.id.editNumber);
        btnResultGame = (Button) findViewById(R.id.btnGameThree);
        result1 = (TextView) findViewById(R.id.textResThree);
        result2 = (TextView) findViewById(R.id.textResThree2);

        btnResultGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result1.setText("");
                result2.setText("");
                curNumber = 0;
                strCur = "";
                addSub="";
                int setNum = Integer.parseInt(insertNumber.getText().toString());
                resultGame(setNum);
                result1.setText("Current Number: "+strCur);
                result2.setText("Add/Substract: "+addSub);
            }
        });
    }

    private void resultGame(int setNum) {
        if(setNum!=1){
            if(setNum%3==2){
                if(strCur.equals("")){
                    strCur = String.valueOf(setNum);
                    addSub = "+1";
                }
                else{
                    strCur = strCur+", "+setNum;
                    addSub = addSub+", +1";
                }
                curNumber = (setNum+1)/3;
                resultGame(curNumber);
            }
            else if(setNum%3==1){
                if(strCur.equals("")){
                    strCur = String.valueOf(setNum);
                    addSub = "-1";
                }
                else{
                    strCur = strCur+", "+setNum;
                    addSub = addSub+", -1";
                }
                curNumber = (setNum-1)/3;
                resultGame(curNumber);
            }
            else if(setNum%3==0){
                if(strCur.equals("")){
                    strCur = String.valueOf(setNum);
                    addSub = "-1";
                }
                else{
                    strCur = strCur+", "+setNum;
                    addSub = addSub+", 0";
                }
                curNumber = (setNum-0)/3;
                resultGame(curNumber);
            }
        }
    }
}
