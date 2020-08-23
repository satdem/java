package Mentoring.Tahir25.ornek2;

import org.junit.Assert;
import org.junit.Test;

public class maxNumberTest {
    @Test
    public void maxNumberTest(){
        maxBulma m=new maxBulma();
        int arr=m.MaxNumberArray(new int[]{1, 2, 3, 7, 9});
        int sonuc=9;
        Assert.assertEquals(arr,sonuc);
    }
}
