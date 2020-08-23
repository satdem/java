package Mentoring.mentoring24Omer.islemler;

public class mainclass {
    public static void main(String[] args) {
        islemler islem=new islemler();

        int random1=(int)(Math.random()*15+1);
        int random2=(int)(Math.random()*15+1);
        System.out.println("random1 = " + random1);
        System.out.println("random2 = " + random2+"\n");

        System.out.println("----------------------");
        System.out.println("toplama islem = " + islem.topla(random1,random2));
        System.out.println("cıkarma islem = " + islem.cikar(random1,random2));
        System.out.println("carpma islem = " + islem.carp(random1,random2));
        System.out.println("bolme islem = " + islem.bol(random1,random2));
    }
}
