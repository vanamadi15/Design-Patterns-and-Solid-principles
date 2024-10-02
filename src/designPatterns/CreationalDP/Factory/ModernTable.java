package designPatterns.CreationalDP.Factory;

class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a modern table.");
    }
}