package org.example.Salary;

public class TotalSalary {
    String name;
    int workday;
    float dailycharge;
    float salary;
    void calculate(){
        if (workday < 30) {

            salary = workday * dailycharge;
            salary += workday > 25 ? (workday - 25) * 1000 : 0;
            System.out.println(name + " kişisinin maası: " + salary);
        }
        else {

            System.out.println("Lütfen 1 aylık çalışma günü giriniz.");

        }

    }



}
