public class MinimalistStrategy implements PlannerStrategy {

    @Override
    public String createPlan(String goal) {
        return """
                === MINIMALIST DAILY PLAN ===
                Main goal: %s

                09:00 - Choose the 3 most important tasks
                10:00 - Work on the main task
                11:00 - Take a short break
                11:15 - Continue working
                13:00 - Review progress
                18:00 - Relax and prepare for tomorrow
                """.formatted(goal);
    }
}
