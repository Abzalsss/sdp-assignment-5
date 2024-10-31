public class BoostEffect implements Visitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Boost effect applied. Character is temporarily strengthened!");
        character.setState(new PoweredUpState());
    }

    @Override
    public void applyDamage(Character character) {
        // This effect does not apply damage
    }
}
