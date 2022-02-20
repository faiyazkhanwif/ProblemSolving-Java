/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.thirtydaysofcode;

/**
 *
 * @author faiya
 */
import java.util.*;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] ts) {
        super(firstName, lastName, identification);
        testScores = ts;
    }

    public char calculate() {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        int avg = sum / testScores.length;

        //System.out.println("avg: " + avg);
        if (avg >= 90 && avg <= 100) {
            return 'O';
        } else if (avg >= 80 && avg < 90) {
            return 'E';
        } else if (avg >= 70 && avg < 80) {
            return 'A';
        } else if (avg >= 55 && avg < 70) {
            return 'P';
        } else if (avg >= 40 && avg < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }

}

class D12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
