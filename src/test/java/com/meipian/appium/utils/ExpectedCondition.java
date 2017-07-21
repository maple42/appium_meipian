package com.meipian.appium.utils;

import com.google.common.base.Function;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by spook on 2017/7/20.
 *
 *
 *
 */

public interface ExpectedCondition<T> extends Function<AndroidDriver, T> {
}

/*
sampler:

    public AndroidElement waitAuto(By by, int time) {
        try {
            return new AndroidDriverWait(driver, time)
                    .until(new ExpectedCondition<AndroidElement>() {
                        @Override
                        public AndroidElement apply(AndroidDriver androidDriver) {
                            return (AndroidElement) androidDriver.findElements(by);
                        }
                    });
        } catch (TimeoutException e) {
            Assert.fail("查找元素超时!! " + time + " 秒之后还没找到元素 [" + by.toString() + "]", e);
            return null;
        }
    }
*/
