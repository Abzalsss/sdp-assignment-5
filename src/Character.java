public class Character {
    private State currentState;
    private Strategy currentStrategy;

    public Character() {
        this.currentState = new NormalState();
        this.currentStrategy = new MeleeStrategy();
    }

    public void setState(State state) {
        this.currentState = state;
        System.out.println("Character's state has been changed.");
    }

    public void setStrategy(Strategy strategy) {
        this.currentStrategy = strategy;
        System.out.println("Fighting strategy has been changed.");
    }

    public void performAttack() {
        currentState.attack();
    }

    public void performFight() {
        currentStrategy.fight();
    }

    public void accept(Visitor visitor) {
        visitor.applyBoost(this);
        visitor.applyDamage(this);
    }
}
