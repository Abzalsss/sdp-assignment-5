public abstract class GameAction {
    public final void executeAction() {
        prepare();
        action();
        finish();
    }

    protected void prepare() {
        System.out.println("Preparing for action...");
    }

    protected abstract void action(); // Concrete action implemented in subclasses

    protected void finish() {
        System.out.println("Action completed.");
    }
}
