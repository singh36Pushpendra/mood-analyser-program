package analyse.mood;

import junit.framework.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void analyseMoodTest() {
        MoodAnalyser analyser = new MoodAnalyser("");

        try {
            Assert.assertEquals("HAPPY", analyser.analyseMood());
        }
        catch (MoodAnalysisException invalidMood) {
            System.out.println(invalidMood.getMessage());
        }
    }
}
