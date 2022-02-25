package com.example.calculatorfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    double mValueOne = 0, mValueTwo = 0;
    private ArrayList<String> data;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button clear;
    Button negative;
    Button point;
    Button equal;
    Button divide;
    Button multiply;
    Button rest;
    Button sum;
    Button square;
    Button squareRoot;
    Button log;
    Button exponentiation;
    Button nRoot;
    ListView listView;
    TextView numberText;
    ArrayList<String> numberList = new ArrayList<>();
    boolean addition, subtraction, division, multiplication, squareR,nR,Sq,ex,l;
   // ArrayAdapter<String> adapterNames = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, numberList);
       // listView.setAdapter(adapterNames);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final ArrayAdapter<String> adapterNames = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, numberList);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapterNames);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        clear = (Button) findViewById(R.id.clear);
        negative = (Button) findViewById(R.id.negative);
        point = (Button) findViewById(R.id.point);
        equal = (Button) findViewById(R.id.equal);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);
        rest = (Button) findViewById(R.id.rest);
        sum = (Button) findViewById(R.id.sum);
        numberText = (TextView) findViewById(R.id.numberText);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            squareRoot = (Button) findViewById(R.id.squareRoot);
            squareRoot.setOnClickListener(this);
        }
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            nRoot = (Button) findViewById(R.id.nRoot);
            nRoot.setOnClickListener(this);
        }
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            square = (Button) findViewById(R.id.square);
            square.setOnClickListener(this);
        }
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            exponentiation = (Button) findViewById(R.id.exponentation);
            exponentiation.setOnClickListener(this);
        }
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            log = (Button) findViewById(R.id.log);
            log.setOnClickListener(this);
        }

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "0");
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numberText.getText().length() != 0) {
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();

                    mValueOne = Float.parseFloat(numberText.getText() + "");
                    addition = true;

                    numberText.setText(sum.getText().toString());
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    numberText.setText(null);
                }
            }
        });

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberList.add(numberText.getText().toString());
                adapterNames.notifyDataSetChanged();

                mValueOne = Float.parseFloat(numberText.getText() + "");

                numberText.setText(rest.getText().toString());
                numberList.add(numberText.getText().toString());
                adapterNames.notifyDataSetChanged();

                subtraction = true;
                numberText.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                numberList.add(numberText.getText().toString());
                adapterNames.notifyDataSetChanged();

                mValueOne = Float.parseFloat(numberText.getText() + "");

                numberText.setText(multiply.getText().toString());
                numberList.add(numberText.getText().toString());
                adapterNames.notifyDataSetChanged();

                multiplication = true;
                numberText.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                numberList.add(numberText.getText().toString());
                adapterNames.notifyDataSetChanged();

                mValueOne = Float.parseFloat(numberText.getText() + "");

                numberText.setText(divide.getText().toString());
                numberList.add(numberText.getText().toString());
                adapterNames.notifyDataSetChanged();

                division = true;
                numberText.setText(null);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                // Get the selected item text from ListView
                                                String selectedItem = (String) parent.getItemAtPosition(position);

                                                // Display the selected item text on TextView
                                                numberText.setText(selectedItem);
                                            }
                                        });
        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (addition || subtraction || multiplication || division || squareR||nR||Sq||ex||l) {
                    mValueTwo = Float.parseFloat(numberText.getText() + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();

                    numberText.setText(equal.getText().toString());
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                }

                if (addition) {
                    numberText.setText(mValueOne + mValueTwo + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    addition = false;
                }
                if (subtraction) {
                    numberText.setText(mValueOne - mValueTwo + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    subtraction = false;
                }
                if (multiplication) {
                    numberText.setText(mValueOne * mValueTwo + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    multiplication = false;
                }
                if (division) {
                    numberText.setText(mValueOne / mValueTwo + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    division = false;
                }
                if (squareR) {
                    numberText.setText(Math.sqrt(mValueTwo) + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    squareR = false;
                }
                if (nR) {
                    numberText.setText(Math.sqrt(mValueOne * Math.sqrt(mValueTwo)) + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    nR = false;
                }
                if (Sq) {
                    numberText.setText((mValueTwo*mValueTwo) + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    Sq = false;
                }
                if (ex) {
                    numberText.setText(Math.pow(mValueOne,mValueTwo) + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    ex = false;
                }
                if (l) {
                    numberText.setText(Math.log10(mValueTwo) + "");
                    numberList.add(numberText.getText().toString());
                    adapterNames.notifyDataSetChanged();
                    l = false;
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText("");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + ".");
            }
        });
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText() + "-");
            }
        });

    }

    @Override
    public void onClick(View v) {
        // mValueTwo = Float.parseFloat(numberText.getText() + "");
        listView = (ListView) findViewById(R.id.list);


        final ArrayAdapter<String> adapterNames = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, numberList);
        listView.setAdapter(adapterNames);
        switch (v.getId()) {
            case R.id.squareRoot: {
                numberList.add(numberText.getText().toString());
                adapterNames.notifyDataSetChanged();

                numberText.setText(squareRoot.getText().toString());
                numberList.add(numberText.getText().toString());
                adapterNames.notifyDataSetChanged();
                squareR = true;
                numberText.setText(null);
            }
            break;
            case R.id.nRoot: {
                numberText.setText(nRoot.getText().toString());
                numberList.add(numberText.getText().toString());
                nR = true;
                numberText.setText(null);
            }
            break;
            case R.id.square: {
                numberText.setText(square.getText().toString());
                numberList.add(numberText.getText().toString());
                Sq = true;
                numberText.setText(null);
            }
            break;
            case R.id.exponentation: {
                mValueOne = Float.parseFloat(numberText.getText() + "");

                numberText.setText(exponentiation.getText().toString());
                numberList.add(numberText.getText().toString());
                ex = true;
                numberText.setText(null);
            }
            break;
            case R.id.log: {
                numberText.setText(log.getText().toString());
                numberList.add(numberText.getText().toString());
                l = true;
                numberText.setText(null);
            }
            break;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("savText", numberText.getText().toString());
        numberText.setText(outState.getString("savText"));
        //Parcelable state = listView.onSaveInstanceState();
        listView.onRestoreInstanceState(outState);



    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore variables on screen orientation change
        numberText.setText(savedInstanceState.getString("savText"));
       // Parcelable state = listView.onSaveInstanceState();
        listView.onRestoreInstanceState(savedInstanceState);

    }
}
