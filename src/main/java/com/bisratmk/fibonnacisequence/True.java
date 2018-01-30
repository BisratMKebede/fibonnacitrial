package com.bisratmk.fibonnacisequence;

public class True {
    public  int fbonnaciM (int count){
        int fbonnaci ;
        if (count==0) {
            fbonnaci = 0;
        }
        else  if (count <= 2){
            fbonnaci = 1;
        }
        else{

            fbonnaci = fbonnaciM (count-1) + fbonnaciM(count-2);}

        return fbonnaci ;
    }
}


