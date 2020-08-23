package Gun42.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class _6_LocalDateManipulation {

    @Test
    public void testPlus() {

        LocalDate bugun = LocalDate.now();
        LocalDate actuel = bugun.plusDays(1).plusMonths(1).plusYears(1);
        String expect = "2021-08-22";//beklenen
        String result = actuel.toString();//bizim sonucumuz
        Assert.assertEquals("sizin somnucunuz " + actuel + "ama sonuc 2021-08-22 olmalı", expect, result);
    }

        // testMinus adında bir test metodu yazınız. Bugünün tarihi alınız. Daha Sonra 1 gün, 1 Ay ve 1 yıl çıkartarak
        // 2. bir tarih oluşturup, bu tarihin sonucunu Assert ile kontrol ediniz.

    @Test
    public void testMinus(){

        LocalDate bugun = LocalDate.now();
        LocalDate actual = bugun.minusDays(1).minusMonths(1).minusYears(1);

        String expect = "2019-06-20";
        Assert.assertEquals("Kod hatalı",expect,actual.toString());

    }

}
