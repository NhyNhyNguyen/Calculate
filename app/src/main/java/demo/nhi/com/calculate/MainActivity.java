package demo.nhi.com.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText input;
    private TextView result ;
    private Button number0;
    private Button number1;
    private Button number2;
    private Button number3;
    private Button number4;
    private Button number5;
    private Button number6;
    private Button number7;
    private Button number8;
    private Button number9;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button AC;
    private Button Clear;
    private Button equal;
    private Button point;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText)findViewById(R.id.ed_input);
        result = (TextView) findViewById(R.id.tv_result);
        number0= (Button) findViewById(R.id.btn_0);
        number1= (Button) findViewById(R.id.btn_1);
        number2= (Button) findViewById(R.id.btn_2);
        number3= (Button) findViewById(R.id.btn_3);
        number4= (Button) findViewById(R.id.btn_4);
        number5= (Button) findViewById(R.id.btn_5);
        number6= (Button) findViewById(R.id.btn_6);
        number7= (Button) findViewById(R.id.btn_7);
        number8= (Button) findViewById(R.id.btn_8);
        number9= (Button) findViewById(R.id.btn_9);
        add= (Button) findViewById(R.id.btn_add);
        sub= (Button) findViewById(R.id.btn_sub);
        mul= (Button) findViewById(R.id.btn_mul);
        div= (Button) findViewById(R.id.btn_div);
        AC= (Button) findViewById(R.id.btn_ac);
        Clear= (Button) findViewById(R.id.btn_c);
        equal= (Button) findViewById(R.id.btn_equal);
        point= (Button) findViewById(R.id.btn_point);
        setOnclick();
    }


    public void setOnclick(){
        number0.setOnClickListener(this);
        number1.setOnClickListener(this);
        number2.setOnClickListener(this);
        number3.setOnClickListener(this);
        number4.setOnClickListener(this);
        number5.setOnClickListener(this);
        number6.setOnClickListener(this);
        number7.setOnClickListener(this);
        number8.setOnClickListener(this);
        number9.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        AC.setOnClickListener(this);
        Clear.setOnClickListener(this);
        point.setOnClickListener(this);
        equal.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_0:
                input.append("0");
                break;
            case R.id.btn_1:
                input.append("1");
                break;
            case R.id.btn_2:
                input.append("2");
                break;
            case R.id.btn_3:
                input.append("3");
                break;
            case R.id.btn_4:
                input.append("4");
                break;
            case R.id.btn_5:
                input.append("5");
                break;
            case R.id.btn_6:
                input.append("6");
                break;
            case R.id.btn_7:
                input.append("7");
                break;
            case R.id.btn_8:
                input.append("8");
                break;
            case R.id.btn_9:
                input.append("9");
                break;
            case R.id.btn_add:
                input.append("+");
                break;
            case R.id.btn_sub:
                input.append("-");
                break;
            case R.id.btn_mul:
                input.append("*");
                break;
            case R.id.btn_div:
                input.append("/");
                break;
            case R.id.btn_point:
                input.append(".");
                break;
            case R.id.btn_equal:
                input.append("=");
                break;
            case R.id.btn_ac:
                input.setText(input.getText().toString().substring(0,input.getText().toString().length()-1));
                break;
            case R.id.btn_c:
                input.setText("");
        }
    }
}
