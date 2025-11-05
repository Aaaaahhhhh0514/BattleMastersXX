package Player;

class Effect extends StatusEffect {
    public Effect(String name, int duration, int strength, boolean beneficial) {
        super(name, duration, strength, beneficial);
    }

    @Override
    public void apply(Object target) {
        // Implementation for generic effect
    }
}
