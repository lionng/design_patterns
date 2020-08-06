package Factory_Pattern;

/**
 * @author zhang
 * @version 1.0
 * @description: 正方形
 * @date 2020/8/6 22:40
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
