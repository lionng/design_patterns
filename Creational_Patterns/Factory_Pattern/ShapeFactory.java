package Factory_Pattern;

/**
 * @author zhang
 * @version 1.0
 * @description: 图像的工厂类
 * @date 2020/8/6 22:43
 */
public class ShapeFactory {
    //获取对应类型的对象
    public Shape getInstance(String shapeType){
        if (shapeType==null){
            return null;
        }
        if ("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if ("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }else if ("rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }
        return null;
    }
}
