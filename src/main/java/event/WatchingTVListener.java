package event;

import java.util.Date;

/**
 * @Description: 定义需要通知的对象类
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 6:10 PM
 **/
public class WatchingTVListener {

    public WatchingTVListener()
    {
        System.out.println("watching TV");
    }

    public void stopWatchingTV(Date date)
    {
        System.out.println("stop watching" + date);
    }
}
