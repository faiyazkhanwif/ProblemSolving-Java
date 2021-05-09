/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * 
 */
class Car {

    int uniqueID;
    int topSpeed;
    int horsePower;
    String Transmission;
    String Type;

    public String[][] createCars() {
        String[][] cars = new String[10][8];
        int count = 0;
        int countins = 0;
        for (int i = 0; i < 10; i++) {
            Random val = new Random();
            int minid = 100;
            int maxid = 999;
            int random_id = (int) Math.floor(Math.random() * (maxid - minid + 1) + minid);
            String id = String.valueOf(random_id);

            cars[count][countins] = id;
            countins++;//1

            int minspeed = 150;
            int maxspeed = 300;
            int random_speed = (int) Math.floor(Math.random() * (maxspeed - minspeed + 1) + minspeed);
            String speed = String.valueOf(random_speed);

            cars[count][countins] = speed;
            countins++;//2

            int minhp = 100;
            int maxhp = 500;
            int random_hp = (int) Math.floor(Math.random() * (maxhp - minhp + 1) + minhp);
            String hp = String.valueOf(random_hp);

            cars[count][countins] = hp;
            countins++;//3

            String[] transmission = {"Auto", "Manual", "CVT"};
            int tval = val.nextInt(transmission.length);
            String random_tms = transmission[tval];

            cars[count][countins] = random_tms;
            countins++;//4

            String random_type;
            if (random_hp >= 300 && random_hp <= 500) {
                random_type = "SUV";
            } else {
                String[] othertype = {"Sedan", "Coupe"};
                int typeval = val.nextInt(othertype.length);
                random_type = othertype[typeval];
            }

            cars[count][countins] = random_type;
            countins++;//5

            String[] colors = {"Black", "Blue", "White", "Red", "Yellow"};
            int clval = val.nextInt(colors.length);
            String random_color = colors[clval];

            cars[count][countins] = random_color;
            countins++;//6

            String[] ebs = {"Yes", "No"};
            int ebsval = val.nextInt(ebs.length);
            String random_ebs = ebs[ebsval];

            cars[count][countins] = random_ebs;
            countins++;//7

            String[] airbag = {"Yes", "No"};
            int abval = val.nextInt(airbag.length);
            String random_airbag = airbag[abval];

            cars[count][countins] = random_airbag;
            countins++;//8

            countins = 0; //reset
            count++; //nextcar

        }

        return cars;
    }

}

public class CarGenerator {

    public static void main(String[] args) {
        Car cars = new Car();
        String[][] mycars = cars.createCars();
        System.out.println("id           uniqueID       topSpeed"
                + "           horsepower           transmission"
                + "         Type               color             "
                + "E.Brakes            airBag");
        System.out.println("---------------------------------------------------"
                + "-------------------------------------------------------"
                + "------------------------------------------------------");
        for (int i = 0; i < mycars.length; i++) {
            System.out.print(i + "           ");
            for (int j = 0; j < 8; j++) {
                System.out.print(mycars[i][j] + "                ");

            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to purchase any of the car above?");
        System.out.print("If so, please key in the car ID: ");
        int purid = in.nextInt();
        boolean found = false;
        for (int i = 0; i < mycars.length; i++) {

            //System.out.println(Integer. parseInt(mycars[i][0]));
            if (Integer.parseInt(mycars[i][0]) == purid) {
                System.out.println("Car uniqueID " + String.valueOf(purid) + " is sold. Congratulations!");
                found = true;
                break;
            }

        }
        if (found == false) {
            System.out.println("UniqueID does not exist!");

            System.out.println("id           uniqueID       topSpeed"
                    + "           horsepower           transmission"
                    + "         Type               color             "
                    + "E.Brakes            airBag");
            System.out.println("---------------------------------------------------"
                    + "-------------------------------------------------------"
                    + "------------------------------------------------------");
            for (int m = 0; m < mycars.length; m++) {
                System.out.print(m + "           ");
                for (int n = 0; n < 8; n++) {
                    System.out.print(mycars[m][n] + "                ");

                }
                System.out.println();
            }
        }

    }
}
