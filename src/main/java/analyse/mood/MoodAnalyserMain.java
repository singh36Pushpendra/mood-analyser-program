package analyse.mood;

public class MoodAnalyserMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Program!");

        String msg = "I am Happy because it's my nature to be happy!";
        MoodAnalyser analyser = new MoodAnalyser(msg);
        String mood = analyser.analyseMood();
        System.out.println("Your mood is: " + mood);

        MoodAnalyser nullMood = new MoodAnalyser(null);
        String mood1 = nullMood.analyseMood();
        System.out.println(mood1);
    }
}
