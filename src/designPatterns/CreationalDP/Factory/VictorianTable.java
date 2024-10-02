package designPatterns.CreationalDP.Factory;

class VictorianTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a Victorian table.");
    }
}