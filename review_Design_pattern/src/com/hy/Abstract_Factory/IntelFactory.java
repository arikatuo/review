package com.hy.Abstract_Factory;

import com.hy.Static_Factory_Method.Cpu;
import com.hy.Static_Factory_Method.IntelCpu;
import com.hy.Static_Factory_Method.IntelMainboard;
import com.hy.Static_Factory_Method.Mainboard;


/**
 * Created by sumimasah on 2017/9/6.
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(755);
    }
}
