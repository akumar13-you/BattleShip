/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finaljavaproject;

/**
 *
 * @author skumar
 */
import java.util.Scanner;
public class SimpleBattleShip {
    public static void main(String[] args) {
        boolean[][] grid = new boolean[10][10];
        boolean[][] ships = new boolean[10][10];
        int temp = 0;
        int r = 0;
        int q = 0;
        int t = 0;


        Scanner y = new Scanner(System.in);
        System.out.print("Type in a row to create the row a ship will be in.");
        q = y.nextInt();
        System.out.print("Type in a column to create the row a ship will be in.");
        t = y.nextInt();
        ships[q + 1][t] = true;
        ships[q + 2][t] = true;

        Scanner in = new Scanner(System.in);
        System.out.print("Type in a row to create the row a ship will be in.");
        r = in.nextInt();
        System.out.print("Type in a column to create the row a ship will be in.");
        temp = in.nextInt();
        ships[r + 1][temp] = true;
        ships[r + 2][temp] = true;
        ships[r + 3][temp] = true;

        int numHits = 0;

        while(true) {
          printGrid(grid);    
          Scanner s = new Scanner(System.in);
          System.out.print("Type in a row: ");
          int row = s.nextInt();
          System.out.print("Type in a column: ");
          int col = s.nextInt();      
          if (ships[row][col] && !grid[row][col]) {
            System.out.println("You hit the ship!");
            grid[row][col] = true;
            numHits++;
          } else if (grid[row][col]) {
            System.out.println("You already hit a ship in this position!");
          } else {
            System.out.println("You missed!");
          }
          if (numHits == 5) {
            System.out.println("You win!");
            break;
          }
        }
  }
    public static void printGrid(boolean[][] grid) {
    System.out.print("  ");
    for (int i = 0; i < grid[0].length; i++) {
      System.out.print(" " + i + " ");
    }
    System.out.println();
    for (int i = 0; i < grid.length; i++) {
      System.out.print(i + " ");
      for (int j = 0; j < grid[0].length; j++){
        if (grid[i][j]) {
          System.out.print(" x ");
        } else {
          System.out.print(" - ");
        }
      }
      System.out.println();
    }
  }
}
