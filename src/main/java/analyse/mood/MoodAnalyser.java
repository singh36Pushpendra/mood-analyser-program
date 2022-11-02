package analyse.mood;

public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    String analyseMood() {
        String[] msgWords;
        try {
            msgWords = message.split(" ");
        }
        catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
            return "";
        }
        for (String word : msgWords)
            if (word.equalsIgnoreCase("sad"))
                return "SAD";
        return "HAPPY";
    }
}
