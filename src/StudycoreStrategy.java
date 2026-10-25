public class StudycoreStrategy implements PlannerStrategy {

    @Override
    public String createPlan(String goal) {
        return """
                 STUDYCORE DAILY PLAN 
                Main goal: %s

                08:30 - Review yesterday's notes
                09:00 - Focus session: 50 minutes
                10:00 - Take a 10-minute break
                10:10 - Practice exercises
                12:00 - Review difficult topics
                14:00 - Complete assignments
                16:00 - Test your knowledge
                17:00 - Check progress and plan tomorrow
                """.formatted(goal);
    }
}
