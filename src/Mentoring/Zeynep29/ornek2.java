package Mentoring.Zeynep29;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class ornek2 {
    /*// LocalTime kullanarak ve test ortaminda
    //1. mevcut saate arti dakika ve saat ekleyiniz
    //2. mevcut saatten eksi dakika ve saat cikariniz*/
    @Test
    public  void test1(){
        LocalTime time=LocalTime.of(1,00);
        LocalTime t1=time.plusHours(1).plusMinutes(45);
        String expected="02:45";
        String result=t1.toString();
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test2(){
        LocalTime time=LocalTime.of(4,30);
        LocalTime t1=time.minusHours(1).minusMinutes(45);
        String expected="02:45";
        String result=t1.toString();
        Assert.assertEquals(expected,result);

    }
}
