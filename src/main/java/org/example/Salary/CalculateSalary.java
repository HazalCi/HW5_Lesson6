package org.example.Salary;

public class CalculateSalary {
    public static void calculateMonthlySalary(Person person) {
        double salary;
        if (person.workday < 0 || person.workday > 30) {
            System.out.println("Lütfen 1 aylık çalışma günü giriniz.");

        }  else {
            salary = person.workday * person.dailycharge;
            salary += person.workday > 25 ? (person.workday - 25) * 1000 : 0;
            System.out.println( "Personel İsmi: " + person.name +"\nPersonel No: " + person.no +"\nPersonel Aylık Çalışma Ücreti: " + salary +"TL");
        }
    }
}
