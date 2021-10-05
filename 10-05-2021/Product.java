public class Product {
    int pcode;
    String pname;
    int price;

  
    public static void main(String[] args) {
        int low;
      Product p1 = new Product();
      Product p2 = new Product();
      Product p3 = new Product();
       p1.pcode=1001;
       p1.pname="Keyboard";
       p1.price=1350;
       p2.pcode=1002;
       p2.pname="Mouse";
       p2.price=700;
       p3.pcode=1003;
       p3.pname="Pendrive";
       p3.price=850;
       if(p1.price<p2.price) {
        if(p3.price<p1.price) {
            low = p3.price;
        } else {
            low = p1.price;
        }
    } else {
        if(p2.price<p3.price) {
            low = p2.price;
        } else {
            low = p3.price;
        }
    }
    
    System.out.println(low + " is the lowest price.");
    }
  }