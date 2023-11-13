/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ok;
    import java.util.Scanner; 
  import java.lang.Math;
/**
 *
 * @author nohaa
 */
public class Ok {
          
 public static void main(String[] args)throws Exception {
  double G;
  double M;
  double m;
  double R;
  double F;
  Scanner myObj = new Scanner(System.in); 
   System.out.println ("enter gravety number");
   G = myObj.nextDouble()*Math.pow(10, -11);
   System.out.println ("enter earth number");
   M = myObj.nextDouble()*Math.pow(10, 24);
   System.out.println ("enter moon number");
   m = myObj.nextDouble()*Math.pow(10, 24);
   System.out.println ("enter R number");
   R = myObj.nextDouble()*Math.pow(10, 22);
  
  F= (G*M*m/ Math.pow(R, 2))*Math.pow(10, 8); 
System.out.println("The result equale "+F);
     }
     
 }

