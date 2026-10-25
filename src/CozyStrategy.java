public class CozyStrategy implements PlannerStrategy {

    @Override
    public String createPlan(String goal) {
        return """
                === COZY DAILY PLAN ===
                Main goal: %s

                09:00 - Start the day slowly
                10:00 - Work on your main task
                11:00 - Enjoy a tea or coffee break
                11:30 - Read a book or study
                14:00 - Continue your activities
                17:00 - Spend time on a favorite hobby
                20:00 - Relax and write in your journal
                """.formatted(goal);
    }
}
