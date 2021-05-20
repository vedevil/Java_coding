/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trial;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class Trial {

    /**
     * @param args the command line arguments
     */
  	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int t = Integer.parseInt(str);
		
		while(t-- > 0) {
		    str = br.readLine();
		    String str1 = br.readLine();
		    str1 = str1.trim() + " ";
		    str = br.readLine();
		    String str2 = br.readLine();
		    str2 = str2.trim() + " ";
		    if(str1.contains(str2)) {
		        System.out.println("Yes");
		    }
		    else {
		        System.out.println("No");
		    }
		}
}
}

