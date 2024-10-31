public class DamageEffect implements Visitor {
    @Override
    public void applyBoost(Character character) {
        // This effect does not boost the character
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("Damage effect applied. Character takes damage.");
        character.setState(new DefeatedState());
    }
}
