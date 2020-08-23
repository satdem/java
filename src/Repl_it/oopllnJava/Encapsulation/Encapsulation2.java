package Repl_it.oopllnJava.Encapsulation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Encapsulation2 {
    /*Burada iki adet class vardır. Biri Main diğeri ise Employees,
Employees(Çalışanlar) class'ında;

Bu variable'ları oluşturunuz;
private String name,
private int salary,
private String dob (date of birth) (Doğum tarihi)
getter ve setter oluşturunuz.
Main class'ın içinde;
Örnek:
Name is Fernando
Salary is 80000
dob is 11/23/2000

main method'un içinde,
Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String dob = scan.nextLine();
        int salary = scan.nextInt();
        Employees emp=new Employees();
        emp.setName(name);
        emp.setSalary(salary);
        emp.setDob(dob);
        System.out.println(emp.getDob());


    }
}
class Employees{
private String name;
private int salary;
private String dob;


public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        LocalDate ld=LocalDate.now();
        System.out.println("ld = " + ld);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dobyeni=LocalDate.parse(this.dob);


        Period a=Period.between(LocalDate.parse(dobyeni.format(format)), LocalDate.parse(ld.format(format)));

    if(a.getYears()>18){
        return "Welcome to our company Fernando your salary is 80000.";
    }
    else if(a.getYears()<18){
        return "come back when you are 18 years old.";
    }
    else
        return "we can have inter with you after that you can have a 80000 salary";
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
