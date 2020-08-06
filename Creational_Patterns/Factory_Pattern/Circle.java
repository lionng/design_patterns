package Factory_Pattern;

/**
 * @author zhang
 * @version 1.0
 * @description: 圆
 * @date 2020/8/6 22:38
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
