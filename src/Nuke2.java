/* Nuke2.java */

import java.io.*;

/** a class called Nuke2 whose main method reads a string from the keyboard and prints the same string, 
 *  with its second character removed.  (That's character number 1, since Java numbers 
 *  characters in a string starting from zero.)  In other words, after you run
 *  "java Nuke2", if you type in the string "skin", the program will print "sin".
 */
class Nuke2 {

  /** 
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));
    inputLine = keyboard.readLine();
    
    if (inputLine.length()< 3){
      System.out.println(inputLine.charAt(0));
    } else {
      String nuke = inputLine.substring(0,1) + inputLine.substring(2);
      System.out.println(nuke);
    }

  }
}
