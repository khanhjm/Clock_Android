package khanhjm.btlandroid;

import android.content.Context;

/**
 * Created by khanh on 17/11/2017.
 */

public class Countdown implements Runnable {

    private Context mContext;
    private int mStartTime, mStopTime, mSum;
    private boolean mIsRunning;

    public Countdown(Context mContext) {
        this.mContext = mContext;
    }

    public void start(String text) {
        mSum = Integer.parseInt(text);
        mIsRunning = true;
    }

    @Override
    public void run() {
        while (mIsRunning) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (mSum > 0)
                mSum = mSum - 1;
            ((MainActivity) mContext).update(String.format("%d", mSum));
        }
    }
}
