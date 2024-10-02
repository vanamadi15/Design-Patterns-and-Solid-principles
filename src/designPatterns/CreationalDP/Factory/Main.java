package designPatterns.CreationalDP.Factory;

public class Main {
    public static void main(String[] args) {
        // Suppose you want to furnish your house in modern style
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        // Use the modern furniture
        modernChair.sitOn();  // Output: Sitting on a modern chair.
        modernTable.use();    // Output: Using a modern table.

        // Now, suppose you want Victorian style instead
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();

        // Use the Victorian furniture
        victorianChair.sitOn();  // Output: Sitting on a Victorian chair.
        victorianTable.use();    // Output: Using a Victorian table.
    }
}
