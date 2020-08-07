package Factory_Pattern;

/**
 * @author zhang
 * @version 1.0
 * @description: 长方形
 * @date 2020/8/6 22:42
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画长方形");
    }
}
