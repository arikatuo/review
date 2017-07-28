package com.hy;

/**
 * Created by dell on 2017/7/19.
 */

    public class Box {
        double length;
        double width;
        double height;
        public Box()
        {
            length=0;
            width=0;
            height=0;
        }
        public double getLength() {
            return length;
        }
        public void setLength(double length) {
            this.length = length;
        }
        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public double getHeight() {
            return height;
        }
        public void setHeight(double height) {
            this.height = height;
        }

        public double getArea()
        {
            return length*width*2+length*height*2+width*height*2;
        }

        public double getVolum()
        {
            return length*width*height;
        }
    }

