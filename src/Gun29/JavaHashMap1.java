package Gun29;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap1 {
    public static void main(String[] args) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(2,11);// 2 ye 11 atatdık
        m.put(3,12);
        m.put(4,13);
        m.put(2,14);//11 değerini 14 ile değiştirdik

        System.out.println("m.get(2) = " +m.get(2));
        System.out.println("m.keySet ()= " +m.keySet());
        System.out.println("m.values() = " + m.values());
        System.out.println("m = " + m);//bu yazılım yöntemi bir ön izlemedir değerlere tek tek ulaşamazsınız

            //2. YÖNTEMLER
        for (Integer ky:m.keySet())
        {
            System.out.println("ky = " + ky);
        }
        for (Integer vl:m.values())
        {
            System.out.println("vl = " + vl);
        }
        for (Map.Entry<Integer,Integer> keyValue:m.entrySet()) //içindeki tüm girdileri veriyor
        {
            System.out.print("keyValue.getKey() = " + keyValue.getKey());//bu anahtarı
            System.out.print("keyValue.getValue() = " + keyValue.getValue());//bu girdileri verir
            System.out.println();
        }

        boolean buAnahtarVarMi=m.containsKey(2);
        boolean buDegerVarMi=m.containsValue(12);
        System.out.println("buAnahtarVarMi = " + buAnahtarVarMi);
        System.out.println("buDegerVarMi = " + buDegerVarMi);

        m.remove(2);
        System.out.println("remove den sonra = " + m);

        m.clear();
        System.out.println("clear den sonra = " + m);

    }
}
