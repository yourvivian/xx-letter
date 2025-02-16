package xyz.bijit.swagger;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TweetService {
    private List<Tweet> tweetList = new ArrayList<>();

    public void addTweet(){
        Tweet tweet = new Tweet();
        tweet.setId(1);
        tweet.setTitle("My first tweet");
        tweet.setMsg("This is a dummy tweet for demonstration purposes.");
        tweetList.add(tweet);

        Tweet tweet2 = new Tweet();
        tweet2.setId(2);
        tweet2.setTitle("My second tweet");
        tweet2.setMsg("This is the second dummy tweet for demonstration purposes.");
        tweetList.add(tweet2);
    }

    public List<Tweet> getTweets() {
        return tweetList;
    }


}
