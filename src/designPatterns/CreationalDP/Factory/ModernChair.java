package designPatterns.CreationalDP.Factory;

// Step 2: Create concrete products for each style (Modern and Victorian)

// Modern Chair and Table
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}

