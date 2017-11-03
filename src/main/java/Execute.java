import java.util.List;

/**
 * Created by a203635 on 2017/10/31.
 */
public class Execute {


  /**
   * Main Method to Execute
   */
  public static void main(String[] args) throws Exception {

    Readfiles read = new Readfiles();
    //Retrive users and tweets
    List<User> users = read.getUsers();
    List<Tweet> tweets = read.getTweets();

    String tweetContent = "";

    //Display the Information Read
    for (User temp : users) {
      System.out.println(temp.getUserName() + "\n");
      for (Tweet tweet : tweets) {
        tweetContent = tweet.getTweetText();
        tweetContent = tweetContent.replaceAll("\\>..*", "");

        if (temp.getUserName().equalsIgnoreCase("Ward")) {
          System.out.println("\t\t\t@" + tweet.getTweetText().replaceAll("\\>", ":"));
        } else if (tweetContent.equalsIgnoreCase(temp.getUserName())) {
          System.out.println("\t\t\t@" + tweet.getTweetText().replaceAll("\\>", ":"));
        }
      }
    }
  }
}


