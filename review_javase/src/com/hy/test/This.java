package com.hy.test;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class This {
    public static void main(String[] args) {
        human human = new human();
        System.out.println(human);
        human.breath();
        human.repeatBreath(5);
    }
}

class human {

    public  human(){
        System.out.println("ff");
    }

    public void human(){
        System.out.println("ss");
    }


    public void breath() {
        System.out.println("hu..hu..hu..ha..");
    }

    public void repeatBreath(int i) {
        for (int j = 0; j < i; j++) {
            this.breath();
        }
    }
}