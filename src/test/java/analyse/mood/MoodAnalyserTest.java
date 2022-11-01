package analyse.mood;

import junit.framework.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void analyseMoodTest() {
        MoodAnalyser analyser = new MoodAnalyser();
        Assert.assertEquals("SAD", analyser.analyseMood("I am in Sad Mood"));
    }
}
