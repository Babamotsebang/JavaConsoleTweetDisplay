import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by a203635 on 2017/10/31.
 */
public class Readfiles {

  //Variable Declaration
  private static final String users = "\\SpringLearning\\spring5webapp\\AllanGray\\src\\main\\resources\\user.txt";
  private static final String tweets = "\\SpringLearning\\spring5webapp\\AllanGray\\src\\main\\resources\\tweet.txt";

  private BufferedReader bufferedReader = null;


  /**
   * Method to read users from the File and Return a List
   */
  public List<User> getUsers() throws Exception {
    List<String> usersRead = read(users);
    TreeSet<String> userList = new TreeSet<String>();
    List<User> userFinalList = new ArrayList<User>();

    String concat = "";
    for (String temp : usersRead) {
      String concatination = temp.replace("follows", ", ");
      concat = concatination + "," + concat;
    }
    concat = concat.replaceAll("\\s+", "");
    String[] userRawList = concat.split(",");
    for (String temp : userRawList) {
      userList.add(temp);
    }

    for (String temp : userList) {
      User user = new User();
      user.setUserName(temp);
      userFinalList.add(user);
    }

    return userFinalList;
  }

  /**
   * Method to read Tweet and Returns a list
   */
  public List<Tweet> getTweets() throws Exception {
    List<String> Rawtweets = read(tweets);
    List<Tweet> tweets = new ArrayList<Tweet>();
    for (String temp : Rawtweets) {
      Tweet tweet = new Tweet();
      tweet.setTweetText(temp);
      tweets.add(tweet);
    }
    return tweets;
  }

  /**
   * method to read from a file
   */
  public List read(String fileLocation) throws IOException {
    List<String> line = new ArrayList<String>();
    try {
      bufferedReader = new BufferedReader(new FileReader(fileLocation));
      String lineRead;
      while ((lineRead = bufferedReader.readLine()) != null) {
        line.add(lineRead);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (bufferedReader != null) {
        bufferedReader.close();
      }
    }
    return line;
  }

}
