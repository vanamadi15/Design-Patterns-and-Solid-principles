package designPatterns.CreationalDP.Factory;

// Factory for Modern furniture
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();  // Creates a Modern Chair
    }

    @Override
    public Table createTable() {
        return new ModernTable();  // Creates a Modern Table
    }
}
