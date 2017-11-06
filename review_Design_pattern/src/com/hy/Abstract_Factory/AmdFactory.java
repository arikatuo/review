package com.hy.Abstract_Factory;


import com.hy.Static_Factory_Method.AmdCpu;
import com.hy.Static_Factory_Method.AmdMainboard;
import com.hy.Static_Factory_Method.Cpu;
import com.hy.Static_Factory_Method.Mainboard;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new AmdMainboard(938);
    }
}
