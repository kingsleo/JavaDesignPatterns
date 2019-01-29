package event;

import org.junit.Test;

import java.util.Date;

/**
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 6:18 PM
 **/
public class EventTest {

    @Test
    public void test() {
        Notifier goodNotifier = new ConcreteNotifier();

        PlayingGameListener playingGameListener = new PlayingGameListener();

        WatchingTVListener watchingTVListener = new WatchingTVListener();

        goodNotifier.addListener(playingGameListener, "stopPlayingGame", new Date());

        goodNotifier.addListener(watchingTVListener, "stopWatchingTV", new Date());

        goodNotifier.notifyX();
    }
}