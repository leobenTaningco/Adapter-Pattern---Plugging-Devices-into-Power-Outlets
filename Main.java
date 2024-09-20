public class Main{
    public static void main(String args[]){
        Laptop laptop = new Laptop();
        Smartphone smartphone = new Smartphone();
        Refrigerator refrigerator = new Refrigerator();

        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphone);
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);

        laptopAdapter.plugIn();
        smartphoneAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        
    }
}
