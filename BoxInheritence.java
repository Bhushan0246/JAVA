class Box{
    double length, bredth, height;
    Box(){
        length = 5;
        bredth = 4;
        height = 6;
    }
    Box(double l, double b, double h){
        length = l;
        bredth = b;
        height = h;
    }
    Box(double side){
        length = bredth = height = side;
    }
    double volume(){
        return length*bredth*height;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super();
        weight = 10.4;
    }
    BoxWeight(double l, double b, double h, double w){
        super(l, b, h);
        weight = w;
    }
    BoxWeight(double side, double w){
        super(side);
        weight = w;
    }
}
class TestBox{
    public static void main(String[] args){
        BoxWeight box1 = new BoxWeight();
        BoxWeight box2 = new BoxWeight(2.0, 5, 8.1, 5.4);
        BoxWeight box3 = new BoxWeight(15, 95.2);
        System.out.println("Volume box One: " + box1.volume());
        System.out.println("Weight: " + box1.weight);
        System.out.println("Volume box two: " + box2.volume());
        System.out.println("Weight: " + box2.weight);
        System.out.println("Volume box three: " + box3.volume());
        System.out.println("Weight: " + box3.weight);
    }
}