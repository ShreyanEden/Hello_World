/*Illustrate java program to expression evaluate using command line
arguments*/

class Si
{
 public static void main(String[]args)
  {
   float Si;
   float p=Float.parseFloat(args[0]);
   int t=Integer.parseInt(args[1]);
   float r=Float.parseFloat(args[2]);

   Si=(p*t*r)/100;
   System.out.println("Simple intrest="+Si);
  }
}