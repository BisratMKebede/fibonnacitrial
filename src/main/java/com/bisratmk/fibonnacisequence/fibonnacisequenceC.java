package com.bisratmk.fibonnacisequence;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fibonnacisequenceC {
    @RequestMapping("/FS")
    public String fibonnacisequenceM( @RequestParam("Num") int n) {
        String totalSeq = " ";
        int count = 0;
        True newObject = new True();
        while (count != n) {
            int tempo = newObject.fbonnaciM(count);
            totalSeq += String.valueOf(tempo);
        }
        return totalSeq;
    }


}