/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
class Checker implements Comparator<Player>{

    @Override
    public int compare(Player t, Player t1) {
        int scorep1 = t.score;
        String namep1 = t.name;
        int scorep2 = t1.score;
        String namep2 = t1.name;
        if (scorep1<scorep2 && namep1!=namep2) {
            return 1;
        }else if (scorep1==scorep2){
            if (namep1.compareToIgnoreCase(namep2)>0) {
                return 1;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
        
    }
    
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
