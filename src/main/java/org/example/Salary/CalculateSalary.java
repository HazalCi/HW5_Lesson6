package org.example.Salary;

public class CalculateSalary {
    static double salary;
    public static void calculateMonthlySalary(Person person) {
        if (person.workday <= 30) {
            salary = person.workday * person.dailycharge;
            salary += person.workday > 25 ? (person.workday - 25) * 1000 : 0;
            System.out.println( "Personel İsmi: " + person.name +"\nPersonel No: " + person.no +"\nPersonel Aylık Çalışma Ücreti: " + salary +"TL");
        }  else {

            System.out.println("Lütfen 1 aylık çalışma günü giriniz.");
        }
    }
}
