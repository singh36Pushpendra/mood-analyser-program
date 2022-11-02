package analyse.mood;

public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    String analyseMood() {
        String[] msgWords = message.split(" ");
        for (String word : msgWords)
            if (word.equalsIgnoreCase("sad"))
                return "SAD";
        return "HAPPY";
    }
}
