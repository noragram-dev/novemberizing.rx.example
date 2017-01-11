package example.operator.async.sync;

import i.Scheduler;
import novemberizing.util.Log;

/**
 *
 * @author novemberizing, i@novemberizing.net
 * @since 2017. 1. 9.
 */
public class Example {

    private static int count = 0;

    public static void main(String[] args){
        Log.disable(Log.HEADER | Log.FLOW);
        Log.depth(3);

        Scheduler.Sync(Scheduler.Foreach(Sync.New(1000, o -> Log.i("async(sync(f)) " + (count++) + ">", o)), args));
    }
}