/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
class Studentcls {

    private int id;
    private String fname;
    private double cgpa;

    public Studentcls(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaCGPAsort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Studentcls> studentList = new ArrayList<Studentcls>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Studentcls st = new Studentcls(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<Studentcls>() {
            @Override
            public int compare(Studentcls t, Studentcls t1) {
                if (t1.getCgpa() > t.getCgpa()) {
                    return 1;
                } else if (t1.getCgpa() < t.getCgpa()) {
                    return -1;
                } else {
                    if (t1.getFname().compareTo(t.getFname())>0) {
                        return -1;
                    }else if(t1.getFname().compareTo(t.getFname())<0)
                        return 1;
                    else{
                        return Integer.valueOf(t1.getId()).compareTo(Integer.valueOf(t.getFname()));
                    }
                }
            }
        });

        for (Studentcls st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
