/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    String url = "http://www." + inputLine + ".com";
    URL u = new URL(url);
    InputStream ustream = u.openStream();
    BufferedReader webpage = new BufferedReader(new InputStreamReader(ustream));
    
    String arr[] = new String[5];
    for(int i=0;i<arr.length; i++){
      arr[i] = webpage.readLine();
    }
    
    for(int i=arr.length-1; i>=0; i--){
      System.out.println(arr[i]);
    }
  
  }
}
