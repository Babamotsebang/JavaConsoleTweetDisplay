import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;

/**
 * Created by a203635 on 2017/10/31.
 */

@PrepareForTest(User.class)
public class UserTest {

  private User user;

  @Test
  public void testUser() {
    user = new User();
    user.setUserName("Pious");
    assertNotNull(user);
    assertEquals("Pious", user.getUserName());
  }

}
