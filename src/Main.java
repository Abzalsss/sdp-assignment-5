public class Main {
    public static void main(String[] args) {
        Character character = new Character();

        // Applying different states
        System.out.println("\nTesting State Pattern:");
        character.setState(new NormalState());
        character.performAttack();

        character.setState(new PoweredUpState());
        character.performAttack();

        character.setState(new DefeatedState());
        character.performAttack();

        // Applying different strategies
        System.out.println("\nTesting Strategy Pattern:");
        character.setStrategy(new MeleeStrategy());
        character.performFight();

        character.setStrategy(new RangedStrategy());
        character.performFight();

        character.setStrategy(new MagicStrategy());
        character.performFight();

        // Executing actions
        System.out.println("\nTesting Template Pattern:");
        GameAction attack = new AttackAction();
        attack.executeAction();

        GameAction defend = new DefendAction();
        defend.executeAction();

        // Applying effects using Visitor
        System.out.println("\nTesting Visitor Pattern:");
        Visitor boostEffect = new BoostEffect();
        Visitor damageEffect = new DamageEffect();

        character.accept(boostEffect);
        character.performAttack();

        character.accept(damageEffect);
        character.performAttack();
    }
}
