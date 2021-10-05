public class complex{
    double a, b;
    complex(double r, double i){
     this.a = r;
     this.b = i;
    }
    public static complex sum(complex c1, complex c2)
    {
         complex temp = new complex(0, 0);
 
         temp.a = c1.a + c2.a;
         temp.b = c1.b+ c2.b;
         return temp;
     }
     public static void main(String args[]) {
     complex c1 = new complex(3, 2);
     complex c2 = new complex(7, 3);
         complex temp = sum(c1, c2);
         System.out.printf("Sum is: "+ temp.a+" + "+ temp.b +"i");
     }
 }