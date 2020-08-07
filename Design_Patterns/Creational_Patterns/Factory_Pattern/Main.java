package Factory_Pattern;

/**
 * @author zhang
 * @version 1.0
 * @description: 主程序
 * @date 2020/8/6 22:51
 */
public class Main {
    public static void main(String[] args) {
        //获取circle对象
        Shape circle = new ShapeFactory().getInstance("circle");
        circle.draw();
        //获取squqre对象
        Shape square = new ShapeFactory().getInstance("square");
        square.draw();
        //获取rectangle
        Shape rectangle = new ShapeFactory().getInstance("rectangle");
        rectangle.draw();
    }
}
/**
 *-------------运行结果
 画圆形
 画正方形
 画长方形
 *
 */
