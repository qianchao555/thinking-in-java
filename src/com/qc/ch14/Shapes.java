package com.qc.ch14;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch14
 * @ClassName: Shapes
 * @Author: android2
 * @Description:
 * @Date: 2019/10/14 上午9:03
 * @Version: 1.0
 */
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
}

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    /**
     * String 返回
     *
     * @return
     */
    @Override
    abstract public String toString();

}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}
