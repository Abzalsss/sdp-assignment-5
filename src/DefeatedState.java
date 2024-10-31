public class DefeatedState implements State {
    @Override
    public void attack() {
        System.out.println("Character cannot attack; they are defeated.");
    }
}
