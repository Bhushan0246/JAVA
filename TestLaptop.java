import java.util.Scanner;
class TestLaptop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Laptop item_1 = new Laptop();
        System.out.println("Enter Details: Brand Model Color Screen_size Battery Processor RAM ROM Ports");
        item_1.brand = sc.nextLine();
        item_1.model = sc.nextLine();
        item_1.color = sc.next();
        item_1.screen = sc.nextFloat();
        item_1.battery = sc.nextFloat();
        item_1.processor = sc.next();
        item_1.ram = sc.nextInt();
        item_1.rom = sc.nextInt();
        item_1.ports = sc.nextInt();
        int cores = item_1.processor.charAt(1);
        item_1.display();
        item_1.process_speed(cores);
    }
}