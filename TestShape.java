class Shape{
    double len, bdth;
    Shape(){
        len = 1;
        bdth = 1;
    }
    Shape(double rad){
        len = bdth = rad;
    }
    Shape(double l, double b){
        len = l;
        bdth = b;
    }
    Shape(Shape ob){
        this.len = ob.len;
        this.bdth = ob.bdth;
    }
    double area(double rad){
        return 3.14*rad;
    }
    double area(){
        return len*bdth;
    }
}
class TestShape{
    public static void main(String[] args){
        Shape rect = new Shape(10, 10.0);
        Shape cir = new Shape(14.84);
        Shape sqre = new Shape(rect);
        System.out.println("Area of Circle: " + cir.area(14.84));
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Square: " + sqre.area());
    }
}