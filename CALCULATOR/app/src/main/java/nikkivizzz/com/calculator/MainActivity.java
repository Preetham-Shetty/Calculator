package nikkivizzz.com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tstr,tnum;
    int temp=0,num,n;
    double d;
    String s = "",fs = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tstr = (TextView) findViewById(R.id.tstr);
        tnum = (TextView) findViewById(R.id.tnum);
        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button bs = findViewById(R.id.bs);
        Button bp = findViewById(R.id.bp);
        Button bdiv = findViewById(R.id.bdiv);
        Button bm = findViewById(R.id.bm);
        Button bd = findViewById(R.id.bd);
        Button beq = findViewById(R.id.beq);
        Button bsqr = findViewById(R.id.bsqr);
        Button bper = findViewById(R.id.bper);
        Button bpow = findViewById(R.id.bpow);
        Button c = findViewById(R.id.c);
        Button back = findViewById(R.id.back);
        Button pm = findViewById(R.id.pm);
        Button blog = findViewById(R.id.blog);
        Button bi = findViewById(R.id.bi);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 1;
                s += "1";
                tnum.setText(s);
                temp = 0;
            }


        }
        );
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 0;
                s += "0";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 2;
                s += "2";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 3;
                s += "3";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 4;
                s += "4";
                tnum.setText(s);
                temp = 0;

            }


                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 5;
                s += "5";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 6;
                s += "6";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 7;
                s += "7";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 8;
                s += "8";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 9;
                s += "9";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += ".";
                tnum.setText(s);
                temp = 0;

            }


        }
        );
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp==1) {

                    fs = fs.substring(0, fs.length() - 1);

                    fs += s;

                    fs += "÷";
                    s = "";
                    tnum.setText(s);

                    tstr.setText(fs);


                }
                else if(temp==0){
                temp = 1;
                fs += s;

                fs += "÷";
                s = "";
                tnum.setText(s);

                tstr.setText(fs);}

            }


        }
        );


        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ll = fs.length();
                String last;
                if (ll<2){
                    last =fs;
                }
                else {
                last = fs.substring(ll-1);}
                System.out.println(last);
                if (fs.length() == 0){
                    temp = 1;
                    fs += s;
                    fs += "-";
                    s = "";
                    tnum.setText(s);
                    tstr.setText(fs);
                    }


                else if (!last.equals("-")){
                    temp = 1;
                    fs += s;
                    fs += "-";
                    s = "";
                    tnum.setText(s);
                    tstr.setText(fs);}

            }


        }
        );
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp==1) {

                    fs = fs.substring(0, fs.length() - 1);

                    fs += s;

                    fs += "×";
                    s = "";
                    tnum.setText(s);

                    tstr.setText(fs);


                }
                else if(temp==0){
                temp = 1;
                fs += s;

                fs += "×";
                s = "";

                tnum.setText(s);
                tstr.setText(fs);}
            }


        }
        );
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp==1) {

                    fs = fs.substring(0, fs.length() - 1);

                    fs += s;

                    fs += "+";
                    s = "";
                    tnum.setText(s);

                    tstr.setText(fs);


                }
                else if(temp==0){
                    temp = 1;
                    fs += s;

                    fs += "+";
                    s = "";

                    tnum.setText(s);
                    tstr.setText(fs);}
                else{
                    tnum.setText("hello");
                }
            }


        }
        );

        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp==1) {

                    fs = fs.substring(0, fs.length() - 1);

                    fs += s;

                    fs += "⁻¹";
                    s = "";
                    tnum.setText(s);

                    tstr.setText(fs);


                }
                else if(temp==0){
                    temp = 1;
                    fs += s;

                    fs += "⁻¹";
                    s = "";

                    tnum.setText(s);
                    tstr.setText(fs);}
            }


        }
        );
        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp==1) {

                    fs = fs.substring(0, fs.length() - 1);

                    fs += s;

                    fs += "^";
                    s = "";
                    tnum.setText(s);

                    tstr.setText(fs);


                }
                else if(temp==0){
                    temp = 1;
                    fs += s;

                    fs += "^";
                    s = "";

                    tnum.setText(s);
                    tstr.setText(fs);}
            }


        }
        );
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp==1) {

                    fs = fs.substring(0, fs.length() - 1);

                    fs += s;

                    fs += "log";
                    s = "";
                    tnum.setText("");

                    tstr.setText(fs);


                }
                else if(temp==0){
                    temp = 1;
                    fs += s;

                    fs += "^";
                    s = "";

                    tnum.setText(s);
                    tstr.setText(fs);}
            }


        }
        );
        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp==1) {

                    fs = fs.substring(0, fs.length() - 1);

                    fs += s;

                    fs += "%";
                    s = "";
                    tnum.setText(s);

                    tstr.setText(fs);


                }
                else if(temp==0){
                    temp = 1;
                    fs += s;

                    fs += "%";
                    s = "";

                    tnum.setText(s);
                    tstr.setText(fs);}
            }


        }
        );
        bsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (temp==1) {

                    fs = fs.substring(0, fs.length() - 1);

                    fs += s;

                    fs += "√";
                    s = "";
                    tnum.setText(s);

                    tstr.setText(fs);


                }
                else if(temp==0){
                    temp = 1;
                    fs += s;

                    fs += "√";
                    s = "";

                    tnum.setText(s);
                    tstr.setText(fs);}
            }


        }
        );
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.length()>0){
                s = s.substring(0, s.length() - 1);
                tnum.setText(s);}


            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fs = "";
                s ="0";
                temp=0;
                tnum.setText(s);
                tstr.setText(fs);}



        });
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(s);
                a=-a;
                s = Integer.toString(a);
                tnum.setText(s);


            }
        });

        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fs+=s;
                tstr.setText(fs);
                s="";



            }
        });




    }
}
