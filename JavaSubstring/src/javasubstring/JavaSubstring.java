/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javasubstring;

import java.util.Scanner;

/**
 *
 * @author vininascimen7o
 */
public class JavaSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String sub = S.substring(start, end);
        System.out.println(sub);      
    
    }
}
