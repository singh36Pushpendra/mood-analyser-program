package analyse.mood;

public class MoodAnalyser {

    String analyseMood(String message) {
        String[] msgWords = message.split(" ");
        for (String word : msgWords)
            if (word.equalsIgnoreCase("sad"))
                return "SAD";
        return "HAPPY";
    }
}
