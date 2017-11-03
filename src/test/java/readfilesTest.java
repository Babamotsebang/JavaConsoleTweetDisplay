import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by a203635 on 2017/10/31.
 */
@PrepareForTest(Readfiles.class)
public class readfilesTest {

  BufferedReader bufferedReader;

  @Before
  public void setup()
      throws IOException {
    bufferedReader = new BufferedReader(
        new FileReader(
            "\\SpringLearning\\spring5webapp\\AllanGray\\src\\test\\resources\\user.txt"));
  }

  @Test
  public void fileExits() throws Exception {
    String line = bufferedReader.readLine();
    assertThat(line, notNullValue());
  }

}
