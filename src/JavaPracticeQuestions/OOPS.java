package JavaPracticeQuestions;

public class OOPS {
    public static void main(String[] args) {
        Product p1=new Product(123,"Milk",2500);
        p1.applyDiscount(14);
        p1.display();
    }
}

class Product{
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void applyDiscount(double discount){
    this.price-=(this.price*discount/100);
    }
    void display(){
        System.out.println("Item Id: "+this.productId+" "+"Item NAme: "+this.productName+" "+"Total Price After discount"+this.price);
    }

}
