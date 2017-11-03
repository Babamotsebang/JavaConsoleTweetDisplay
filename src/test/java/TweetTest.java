import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.junit.Assert.*;

/**
 * Created by a203635 on 2017/10/31.
 */
@PrepareForTest(Tweet.class)
public class TweetTest {

  private Tweet tweet;

  @Test
  public void testTweet() {
    tweet = new Tweet();
    tweet.setTweetText("Hello There");
    assertNotNull(tweet);
    assertEquals("Hello There", tweet.getTweetText());
  }

}
