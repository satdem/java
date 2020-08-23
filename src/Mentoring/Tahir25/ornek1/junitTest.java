package Mentoring.Tahir25.ornek1;

import org.junit.Assert;
import org.junit.Test;

public class junitTest {
    //Assert.assertEquals
    @Test
    public void testlastchar(){
        Main m=new Main();

        char result=m.lastCharacter("junit");
        char olmasigereken='t';
        Assert.assertEquals(olmasigereken,result);//ya da
        Assert.assertEquals("kodunuz hatalı",olmasigereken,result);//not ekleyebiliyoruz.hatalı ise çıkıyor
        //Assert.assertEquals('t',m.lastCharacter("junit"));
        //

    }
    @Test
    public void tesFaktoriyel(){
        Main mn=new Main();
        int s=mn.FaktoriyelBulma(5);
        int beklenen=120;

        Assert.assertEquals(beklenen,s);

    }
    @Test
    public void testDeneme(){
       /* String s1="Java";
        String s2="Java";
        boolean b=s1.equals(s2);
        Assert.assertTrue(b);*/
        boolean b1=true&&false;
       // Assert.assertTrue(b1);//sonucu true çıkmalı çalışması için bu çalışmaz
        Assert.assertFalse(b1);
    }
}
