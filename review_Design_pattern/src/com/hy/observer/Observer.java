package com.hy.observer;

/**
 * Created by sumimasah on 2017/9/4.
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
