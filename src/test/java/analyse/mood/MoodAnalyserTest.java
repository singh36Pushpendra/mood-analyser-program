package analyse.mood;

import junit.framework.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void analyseMoodTest() {
        MoodAnalyser analyser = new MoodAnalyser();
        Assert.assertEquals("HAPPY", analyser.analyseMood("I am in Any Mood"));
    }
}
