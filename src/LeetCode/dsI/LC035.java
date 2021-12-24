/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.dsI;

import java.util.HashSet;

/**
 *
 * @author faiya
 */
public class LC035 {

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(!String.valueOf(board[i][j]).equals(".")){
                    System.out.println(board[i][j]);
                    String temp1 = String.valueOf(board[i][j])+" - row: "+String.valueOf(i);
                    String temp2 = String.valueOf(board[i][j])+" - col: "+String.valueOf(j);
                    String temp3 = String.valueOf(board[i][j])+" - box: "+i/3+" - "+j/3;
                    System.out.println("test: "+temp3);
                    if (hs.contains(temp1)||hs.contains(temp2)||hs.contains(temp3)) {
                        return false;
                    }else{
                        hs.add(temp1);
                        hs.add(temp2);
                        hs.add(temp3);
                    }
                }
            }
        }
        return true;
    }

}
