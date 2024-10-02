package designPatterns.CreationalDP.Factory;

// Factory for Victorian furniture
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();  // Creates a Victorian Chair
    }

    @Override
    public Table createTable() {
        return new VictorianTable();  // Creates a Victorian Table
    }
}
