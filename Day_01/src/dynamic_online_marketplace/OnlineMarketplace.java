package dynamic_online_marketplace;
//Problem 2 : Dynamic Online Marketplace

abstract class product{
    String name;
    double price;

    product(String name, double price){
        this.name = name;
        this.price=price;
    }

    public double getprice(){
        return price;
    }

    public void setprice(double price){
        this.price=price;
    }
}

class Books extends product{
    public Books(String name, double price){
        super(name,price);
    }
}

class Clothing extends product{
    public Clothing(String name, double price){
        super(name,price);
    }
}

class Gadgets extends product{
    public Gadgets(String name, double price){
        super(name, price);
    }
}

class Product<T extends product>{
    public static <T extends Product> void applyDiscount(T product, double percentage){
        
    }
}

public class OnlineMarketplace {
}
