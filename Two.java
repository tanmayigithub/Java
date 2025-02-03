class One {
  void calculate( int x) {
System.out.println("Square value ="+ (x*x));
} }


class Two extends One {
  void calculate( int x) {
System.out.println("Square value ="+ Math.sqrt(x));
}
public static void main (String[] args)
{
Two t = new Two();
One o1=new Two();// Super class reference refers to subclass object
o1=t;
o1. calculate(25);// call using Super class reference will call the Sub class method
t. calculate(25);
}}