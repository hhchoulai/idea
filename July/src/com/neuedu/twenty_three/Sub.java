package com.neuedu.twenty_three;


class  Super  {
    public  int  getLength(  )  {
        return  4;
    }
}
public  class  Sub  extends  Super  {
    public  long  Length(  )  {
        return  5;
    }
    public  static  void  main  (String[  ]args)  {
        Super  sooper  =  new  Super  (  );
        Super  sub  =  new  Sub(  );
        Sub s=(Sub)sub;
        System.out.println(sooper.getLength(  )+  ","  + ((Sub) sub).Length()  );
    }
}