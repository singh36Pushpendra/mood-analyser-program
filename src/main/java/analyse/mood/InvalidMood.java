package analyse.mood;

public enum InvalidMood {
    EMPTY_STRING(""),
    NULL_STRING(null);

    String mood;

    InvalidMood(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
