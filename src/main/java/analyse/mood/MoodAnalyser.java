package analyse.mood;

public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    String analyseMood() {

        if (InvalidMood.EMPTY_STRING.getMood().equals(message))
            throw  new MoodAnalysisException("Invalid Mood: Can't process Empty Mood!");
        else if (InvalidMood.NULL_STRING.getMood() == message)
            throw new MoodAnalysisException("Invalid Mood: Can't process Null Mood!");

        String[] msgWords = message.split(" ");
        for (String word : msgWords)
            if (word.equalsIgnoreCase("sad"))
                return "SAD";
        return "HAPPY";
    }
}
