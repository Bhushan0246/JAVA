class Product{
    String item;
    int price;
    Product(){
        this.item = null;
        this.price = 00;
    }
    Product(String item, int price){
        this.item = item;
        this.price = price;
    }
    public String toString(){
        System.out.println("Inside Product class toString method.");
        return item + " " + price + " /-";
    }
}
class TestProduct{
    public static void main(String[] args){
        Product pro1 = new Product("Mobile Phone", 15489);
        TestProduct pro2 = new TestProduct();
        System.out.println(pro1);
        System.out.println(pro2);
    }
}