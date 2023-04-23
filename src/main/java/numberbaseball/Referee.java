package numberbaseball;

public class Referee {

    private final RuleBook ruleBook;

    public Referee(RuleBook ruleBook) {
        this.ruleBook = ruleBook;
    }

    public BaseBallRule judgment(Ball ball, int position) {
        return ruleBook.read(ball, position);
    }
}
