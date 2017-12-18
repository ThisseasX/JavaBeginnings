package thisseasx.december2017.exercises.ObserverExercise;

public class ObserverExercise {

    private static NationalNewsAgency news;

    public static void main(String[] args) throws InterruptedException {
        news = new NationalNewsAgency();
        BBCReader bbc = new BBCReader();
        RSSReader rss = new RSSReader();
        news.addObserver(bbc);
        news.addObserver(rss);

        addNewPost("Something terrible has happened!");
        addNewPost("Something awesome has happened!");
        addNewPost("Something incredible has happened!");
        addNewPost("Something cool has happened!");
    }

    static void addNewPost(String post) throws InterruptedException {
        Thread.sleep(3000);
        news.addPost(post);
    }
}
