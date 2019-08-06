package com.neuedu.twenty_four;

import java.math.BigDecimal;
import java.math.BigInteger;

class  Person  {
    String  name,  department;
    int  age;
    public  Person(String  n){  name  =  n;  }
    public  Person(String  n,  int  a){  name  =  n;  age  =  a;  }
    public  Person(String  n,  String  d,  int  a)  {
        //  doing  the  same  as  two  arguments  version  of  constructor
        this(n,a);//  including  assignment  name=n,age=a
        department  =  d;
    }

    public static void main(String[] args) {

    }
}