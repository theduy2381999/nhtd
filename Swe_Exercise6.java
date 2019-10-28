/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swe_Exercise6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author duy
 */
public class Swe_Exercise6 {
    
    private static Scanner scan = new Scanner(System.in);
    
    public static String replaceRepetive(String str) {
        String[] words = str.split("\\s");
        ArrayList<String> words2 = new ArrayList<>();
        String result = "";
        for(String w : words) {
            words2.add(w);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < words2.size(); i++) {
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i).equals(words2.get(j))) { 
                    index.add(j);
                    words2.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
        for(Integer integer : index) {
            words2.set(integer,"");
        }
        for(String string : words2) {
            if(!string.equals("")){
                result += string+" ";
            }
        }
        result=result.replace("\\s+","");
        return result;
    }
     public static String checkString(){
        while (true) {
            String kq = scan.nextLine().trim();
            if (kq.isEmpty()) {
                System.err.println("Do not empty");
                System.out.print("Input String: ");
            } else {
                return kq;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Input String: ");
        String s = checkString();
        System.out.print("Output String: ");
        System.out.println(replaceRepetive(s));
        
    }
}
