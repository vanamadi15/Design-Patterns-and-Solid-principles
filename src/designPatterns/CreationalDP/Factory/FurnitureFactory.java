package designPatterns.CreationalDP.Factory;

// Step 3: Define the Abstract Factory interface
interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}