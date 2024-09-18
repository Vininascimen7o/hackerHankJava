/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hackerhankloop2;

import java.util.Scanner;

/**
 *
 * @author vininascimen7o
 */
public class HackerHankLoop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int equacao = 0;    
            
            for(int j = 0; j < n; j++){
                if (j == 0){
                    equacao = equacao + (a + (int) Math.pow(2, j) * b);
                }
                else {
                    equacao = equacao + (int) Math.pow(2, j) * b;
                }
                System.out.print(equacao + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
    

