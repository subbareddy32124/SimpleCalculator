package com.example.android.constraint;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Stack;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.lang.*;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    TextView t1,t2;
    Double ans;
    StringBuffer s=new StringBuffer();
    Double d[]=new Double[100000];
    int flag=0;
    int count=0;
    int c=0;
    int le=0;
    double x=Double.MAX_VALUE;
    int flag1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Simple Calculator");
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);
        b12=findViewById(R.id.button12);
        b13=findViewById(R.id.button13);
        b14=findViewById(R.id.button14);
        b15=findViewById(R.id.button15);
        b16=findViewById(R.id.button16);
        b17=findViewById(R.id.button17);
        b18=findViewById(R.id.button18);
        b19=findViewById(R.id.button19);
        b20=findViewById(R.id.button20);
        t1=findViewById(R.id.textView3);
        t2=findViewById(R.id.textView6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('0');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
               else {
                    s.append('0');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append("00");
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append("00");
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    count=count+1;
                    s.append('(');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else {
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)>=48 && s.charAt(s.length()-1)<=57){
                    t1.setText(s);
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94) {
                      count=count+1;
                      s.append('(');
                      t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else
                {
                    t1.setText(s);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()=="")
                {
                    t1.setText("");
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94) {
                   t1.setText(s);
                }
                else if(s.charAt(s.length()-1)==40){
                    t1.setText(s);
                }
                else
                {
                    if(count>0) {
                        s.append(')');
                        t1.setText(s);
                        count=count-1;
                        if(flag==1 && count==0){
                            ans=calculation(s);
                            t2.setText(String.valueOf(ans));
                            d[le]=ans;
                            le=le+1;
                        }
                        else{
                            if(flag1==0){
                                d[le]=x;
                                le=le+1;
                            }
                            else {
                                d[le]=ans;
                                le=le+1;
                            }
                        }
                    }
                    else {
                        t1.setText(s);
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('1');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append('1');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('2');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append('2');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText() == "") {
                    s.append('3');
                    t1.setText(s);
                    if (flag == 1 && count == 0) {
                        ans = calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le = le + 1;
                    } else {
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                } else if (s.charAt(s.length() - 1) == 41) {
                    t1.setText(s);
                } else {
                    s.append('3');
                    t1.setText(s);
                    if (flag == 1 && count == 0) {
                        ans = calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le = le + 1;
                    } else {
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()=="")
                    t1.setText("");
                else if(s.charAt(s.length()-1)==40){
                    t1.setText(s);
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94){
                      s.delete(s.length()-1,s.length());
                      s.append('+');
                      t1.setText(s);
                      if(flag==1 && count==0) {
                          d[le]=ans;
                          le = le + 1;
                      }
                      else{
                          if(flag1==0){
                              d[le]=x;
                              le=le+1;
                          }
                          else {
                              d[le]=ans;
                              le=le+1;
                          }
                      }
                      flag=1;
                }
                else{
                    s.append('+');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('4');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append('4');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('5');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append('5');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('6');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append('6');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()=="")
                    t1.setText("");
                else if(s.charAt(s.length()-1)==40){
                    t1.setText(s);
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94){
                    s.delete(s.length()-1,s.length());
                    s.append('-');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
                else{
                    s.append('-');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('7');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append('7');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('8');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append('8');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()==""){
                    s.append('9');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)==41){
                    t1.setText(s);
                }
                else {
                    s.append('9');
                    t1.setText(s);
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                        d[le]=ans;
                        le=le+1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()=="")
                    t1.setText("");
                else if(s.charAt(s.length()-1)==40){
                    t1.setText(s);
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94){
                    s.delete(s.length()-1,s.length());
                    s.append('*');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
                else{
                    s.append('*');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 s.delete(0,s.length());
                 t1.setText("");
                 t2.setText("");
                 flag=0;
                 count=0;
                 le=0;
                 c=0;
                 flag1=0;
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()=="")
                    t1.setText("");
                else if(s.charAt(s.length()-1)==40){
                    t1.setText(s);
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94){
                    s.delete(s.length()-1,s.length());
                    s.append('^');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
                else{
                    s.append('^');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s.length()==0)
                {
                    t1.setText("");
                    t2.setText("");
                }
                else if(s.charAt(s.length()-1)>='0' && s.charAt(s.length()-1)<='9'){
                   s.delete(s.length()-1,s.length());
                   if(s.length()==0)
                       t1.setText("");
                   else
                   t1.setText(s);
                   if(le==1){
                       t2.setText(" ");
                       le=le-1;
                       flag1=0;
                   }
                   else {
                       if(d[le-2]==x){
                           t2.setText(" ");
                           le=le-1;
                           flag1=0;
                       }
                       else {
                           t2.setText(String.valueOf(d[le - 2]));
                           le = le - 1;
                       }
                   }
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94) {
                        s.delete(s.length()-1,s.length());
                    if(s.length()==0)
                        t1.setText("");
                    else
                        t1.setText(s);
                    c=0;
                    for(int j=0;j<s.length();j++){
                        if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94) {
                            c=c+1;
                        }
                    }
                    if(c==0)
                        flag=0;
                    if(le==1){
                        t2.setText(" ");
                        le=le-1;
                        flag1=0;
                    }
                    else {
                        if(d[le-2]==x){
                            t2.setText(" ");
                            le=le-1;
                            flag1=0;
                        }
                        else {
                            t2.setText(String.valueOf(d[le - 2]));
                            le = le - 1;
                        }
                    }
                }
                else if(s.charAt(s.length()-1)=='(')
                {
                    s.delete(s.length()-1,s.length());
                    count=count-1;
                    if(s.length()==0)
                        t1.setText("");
                    else
                        t1.setText(s);
                    if(le==1){
                        t2.setText(" ");
                        le=le-1;
                        flag1=0;
                    }
                    else {
                        if(d[le-2]==x){
                            t2.setText(" ");
                            le=le-1;
                            flag1=0;
                        }
                        else {
                            t2.setText(String.valueOf(d[le - 2]));
                            le = le - 1;
                        }
                    }
                }
                else
                {
                    s.delete(s.length()-1,s.length());
                    count=count+1;
                    if(s.length()==0)
                        t1.setText("");
                    else
                        t1.setText(s);
                    if(le==1){
                        t2.setText(" ");
                        le=le-1;
                        flag1=0;
                    }
                    else {
                        if(d[le-2]==x){
                            t2.setText(" ");
                            le=le-1;
                            flag1=0;
                        }
                        else {
                            t2.setText(String.valueOf(d[le - 2]));
                            le = le - 1;
                        }
                    }
                }
                /*if(s.length()==0) {
                    t1.setText("");
                    t2.setText("");
                }
                else if(s.charAt(s.length()-1)>='0' && s.charAt(s.length()-1)<='9'){
                    if(flag==1 && count==0){
                    ans=calculation(s);
                    t2.setText(String.valueOf(ans));
                    }
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94) {
                    c=0;
                    for(int j=0;j<s.length();j++){
                            if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94) {
                                c=c+1;
                            }
                        }
                        if(c==0)
                            flag=0;
                        else if(c==1){
                            s4.append(s);
                            s4.delete(s.length()-1,s.length());
                            t2.setText(s4.toString());
                            s1.delete(0,s4.length());
                        }
                        else {
                            s1.append(s);
                            s1.delete(s.length()-1,s.length());
                            if(flag==1 && count==0) {
                                ans = calculation(s1);
                                t2.setText(String.valueOf(ans));
                            }
                            s1.delete(0, s1.length());
                        }
                }
                else if(s.charAt(s.length()-1)=='('){
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                    }
                    else
                    {
                        s2.append(s);
                        s2.delete(s.lastIndexOf("(")-1,s.length());
                        ans=calculation(s2);
                        t2.setText(String.valueOf(ans));
                        s2.delete(0,s2.length());
                    }
                }
                else
                {
                    if(flag==1 && count==0){
                        ans=calculation(s);
                        t2.setText(String.valueOf(ans));
                    }
                    else
                    {
                        s3.append(s);
                        if(s3.charAt(0)=='(')
                        s3.delete(s.indexOf("(")-1,s.length());
                        ans=calculation(s3);
                        t2.setText(String.valueOf(ans));
                        s3.delete(0,s3.length());
                    }
                }*/
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()=="")
                    t1.setText("");
                else if(s.charAt(s.length()-1)==40){
                    t1.setText(s);
                }
                else if(s.charAt(s.length()-1)==43 || s.charAt(s.length()-1)==45 || s.charAt(s.length()-1)==42 || s.charAt(s.length()-1)==47 || s.charAt(s.length()-1)==94){
                    s.delete(s.length()-1,s.length());
                    s.append('/');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
                else{
                    s.append('/');
                    t1.setText(s);
                    if(flag==1 && count==0) {
                        d[le]=ans;
                        le = le + 1;
                    }
                    else{
                        if(flag1==0){
                            d[le]=x;
                            le=le+1;
                        }
                        else {
                            d[le]=ans;
                            le=le+1;
                        }
                    }
                    flag=1;
                }
            }
        });

    }
    public double calculation(StringBuffer s1)
    {
                flag1=1;
                String n=s1.toString();
                char[] tokens =n.toCharArray();

                // Stack for numbers: 'values'
                Stack<Double> values = new Stack<Double>();

                // Stack for Operators: 'ops'
                Stack<Character> ops = new Stack<Character>();

                for (int i = 0; i < tokens.length; i++)
                {
                    // Current token is a whitespace, skip it
                    if (tokens[i] == ' ')
                        continue;

                    // Current token is a number, push it to stack for numbers
                    if (tokens[i] >= '0' && tokens[i] <= '9')
                    {
                        StringBuffer sbuf = new StringBuffer();
                        // There may be more than one digits in number
                        while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                            sbuf.append(tokens[i++]);
                        i--;
                        values.push(Double.parseDouble(sbuf.toString()));
                    }

                    // Current token is an opening brace, push it to 'ops'
                    else if (tokens[i] == '(')
                        ops.push(tokens[i]);

                        // Closing brace encountered, solve entire brace
                    else if (tokens[i] == ')')
                    {
                        while (ops.peek() != '(')
                            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                        ops.pop();
                    }

                    // Current token is an operator.
                    else if (tokens[i] == '+' || tokens[i] == '-' ||
                            tokens[i] == '*' || tokens[i] == '/' || tokens[i] == '^')
                    {
                        // While top of 'ops' has same or greater precedence to current
                        // token, which is an operator. Apply operator on top of 'ops'
                        // to top two elements in values stack
                        while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                        // Push current token to 'ops'.
                        ops.push(tokens[i]);
                    }
                }

                // Entire expression has been parsed at this point, apply remaining
                // ops to remaining values
                while (!ops.empty())
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                // Top of 'values' contains result, return it
                return values.pop();
            }

            // Returns true if 'op2' has higher or same precedence as 'op1',
            // otherwise returns false.
            public static boolean hasPrecedence(char op1, char op2)
            {
                if (op2 == '(' || op2 == ')')
                    return false;
                else if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
                    return false;
                else if((op1 == '^') && (op2 == '+' || op2=='-'))
                    return false;
                else if((op1=='^') && (op2 =='*' || op2=='/'))
                    return false;
                else
                    return true;
            }

    // A utility method to apply an operator 'op' on operands 'a'
            // and 'b'. Return the result.
            public static double applyOp(char op, double b, double a)
            {
                switch (op)
                {
                    case '+':
                        return a + b;
                    case '-':
                        return a - b;
                    case '*':
                        return a * b;
                    case '/':
                        if (b == 0)
                            throw new
                                    UnsupportedOperationException("Cannot divide by zero");
                        return a / b;
                    case '^':
                        return Math.pow(a,b);
                }
                return 0;
            }
        }

