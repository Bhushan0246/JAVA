class Laptop{
    String brand, model, color, processor;
    int ram, rom, ports;
    float battery, screen;

    void display(){
        System.out.println("\nLaptop brand: " + brand);
        System.out.println("Brand model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Screen size: " + screen + " inches");
        System.out.println("Battery capacity: " + battery + " hours");
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("ROM: " + rom + " GB");
        System.out.println("Number of ports: " + ports);
    }
        double process_speed(float cores){
            System.out.println("Processor speed: " + (1.5*cores));
            return 1.5*cores;
        }
}