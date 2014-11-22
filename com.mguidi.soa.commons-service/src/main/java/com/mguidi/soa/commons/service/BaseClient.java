package com.mguidi.soa.commons.service;

public abstract class BaseClient {

    private static int[] sFib = new int[20];

    static {
        // Compute Fibonacci series for backoff
        for (int i = 0; i < 20; i++) {
            sFib[i] = i < 2 ? i : sFib[i - 2] + sFib[i - 1];
        }
    }

    /**
     * Implements exponential backoff using the Fibonacci series, which
     * has the effect of backing off with a multiplier of ~1.618
     * (the golden mean) instead of 2, which is rather boring.
     *
     * @param numTries Current number of attempts completed
     * @return Connection timeout in ms for next attempt
     */
    protected static int getNextTimeout(int numTries) {
        // For n=0,1,2,3 returns 1000,2000,3000,5000
        return 1000 * sFib[numTries + 2];
    }

    /**
     * Determines whether an exception was due to a timeout. If the elapsed time
     * is longer than the current timeout, the exception is assumed to be the
     * result of the timeout.
     *
     * @return true if caused by connection or read timeout
     */
    protected static boolean isTimeoutException(long startTime, boolean isConnected, long readTimeout, long connectionTimeout) {
        long elapsedTime = System.currentTimeMillis() - startTime + 10; // fudge

        if (isConnected) {
            return elapsedTime >= readTimeout;
        } else {
            return elapsedTime >= connectionTimeout;
        }
    }
}
