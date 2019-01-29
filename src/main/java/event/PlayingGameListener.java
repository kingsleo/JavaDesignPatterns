package event;

import java.util.Date;

/**
 * @Description: 定义需要通知的对象类
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 6:12 PM
 **/
public class PlayingGameListener {

    public PlayingGameListener()
    {
        System.out.println("playing");
    }

    public void stopPlayingGame(Date date)
    {
        System.out.println("stop playing" + date);
    }
}
