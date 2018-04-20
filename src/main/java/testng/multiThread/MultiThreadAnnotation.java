package testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by chenli12 on 2018/4/20.
 */
public class MultiThreadAnnotation {
    @Test(invocationCount = 10,threadPoolSize = 4)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
