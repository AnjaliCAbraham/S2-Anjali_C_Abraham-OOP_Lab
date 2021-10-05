class sortstring{
public static void main(String[] args) {
String names[]={"Amal","Jyothi","College","of","Engineering"};
String temp;
int n=names.length;
for(int i=0;i<n;i++)
{
  for(int j=i+1;j<n;j++)
  {
   if(names[i].compareTo(names[j])>0)
   {
   temp=names[i];
   names[i]=names[j];
   names[j]=temp;
   
   }
   }
   }
   System.out.println("The sorted array of string is : ");
   for(int i=0;i<n;i++)
{
	System.out.println(names[i]);
   }
 }  
}