package com.example.admin.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double value1, value2;
    int type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text1 = (TextView)findViewById(R.id.text1);

        Button num0 = (Button)findViewById(R.id.num0);
        Button num1 = (Button)findViewById(R.id.num1);
        Button num2 = (Button)findViewById(R.id.num2);
        Button num3 = (Button)findViewById(R.id.num3);
        Button num4 = (Button)findViewById(R.id.num4);
        Button num5 = (Button)findViewById(R.id.num5);
        Button num6 = (Button)findViewById(R.id.num6);
        Button num7 = (Button)findViewById(R.id.num7);
        Button num8 = (Button)findViewById(R.id.num8);
        Button num9 = (Button)findViewById(R.id.num9);

        Button btnAdd = (Button)findViewById(R.id.btnAdd);
        Button btnSub = (Button)findViewById(R.id.btnSub);
        Button btnMul = (Button)findViewById(R.id.btnMul);
        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        Button equal = (Button)findViewById(R.id.equal);
        Button dot = (Button)findViewById(R.id.dot);
        Button convert = (Button)findViewById(R.id.convert);
        Button allDelete = (Button)findViewById(R.id.allDelete);

        allDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("9");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.append("0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().equals("")) {
                    text1.append("0");
                } else if (text1.getText().toString().contains("."))
                    return;
                text1.append(".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty()) {
                    return;
                } else
                    value1 = Double.parseDouble(text1.getText().toString());
                text1.setText("");
                type = 1;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty()) {
                    return;
                } else
                    value1 = Double.parseDouble(text1.getText().toString());
                text1.setText("");
                type = 2;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty()) {
                    return;
                } else
                    value1 = Double.parseDouble(text1.getText().toString());
                text1.setText("");
                type = 3;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty()) {
                    return;
                } else
                    value1 = Double.parseDouble(text1.getText().toString());
                text1.setText("");
                type = 4;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().isEmpty()) {
                    return;
                } else
                    value2 = Double.parseDouble(text1.getText().toString());
                switch(type) {
                    case 1:
                        text1.setText(add(value1,value2));
                        break;
                    case 2:
                        text1.setText(sub(value1,value2));
                        break;
                    case 3:
                        text1.setText(mul(value1,value2));
                        break;
                    case 4:
                        text1.setText(div(value1,value2));
                        break;

                }
            }
        });
    }

    public String add(double value1, double value2) {
        return String.valueOf(value1+value2);
    }
    public String sub(double value1, double value2) {
        return String.valueOf(value1-value2);
    }
    public String mul(double value1, double value2) {
        return String.valueOf(value1*value2);
    }
    public String div(double value1, double value2) {
        if(value2==0) {
            Toast.makeText(this,"0으로 나눌수 없습니다.",Toast.LENGTH_SHORT).show();
            return "" ;
        }
        else return String.valueOf(value1/value2);
    }
}
