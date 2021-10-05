public class shape
{
int side,as,ar;
public void area(int a)

{
side=a;
as=a*a;
System.out.println("Area of square is "+as);
}
public void area(double r)
{
double radi=r;
double ac=(22/7)*radi*radi;
System.out.println("Area of circle is "+ac);
}
public void area(int l,int w)
{
int len=l;
int wid=w;
ar=len*wid;
System.out.println("Area of rectangle : "+ar);
}
public void area(int h,double r)
{
int he=h;
double rad=r;
double acy=(2*(22/7)*rad*he)+((22/7)*rad*rad);
System.out.println("Area of cylinder : "+acy);	

}
public static void main(String[] args)
{
shape s=new shape();
s.area(5);	
s.area(6.52);
s.area(6,5);
s.area(6,5.5);	
}
}
