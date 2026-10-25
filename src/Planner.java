public class Planner {

    private PlannerStrategy strategy;

    public Planner(PlannerStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PlannerStrategy strategy) {
        this.strategy = strategy;
    }

    public String generatePlan(String goal) {
        return strategy.createPlan(goal);
    }
}
