package com.hy.Abstract_Factory;


import com.hy.Static_Factory_Method.Cpu;
import com.hy.Static_Factory_Method.Mainboard;

/**
 * Created by sumimasah on 2017/9/6.
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}
