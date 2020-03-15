public class SingLeton {

    // 静态的instance对象，保证全局唯一性
    private static SingLeton instance = null;

    // 私有的构造函数，防止外部用new关键字创建实例对象
    private SingLeton() {

    }

    // 对外的公共静态实例方法，从类级别直接可以调用此方法
    public static SingLeton getInstance() {

        // 通过判断instance是否为null，决定是否创建对象
        if (instance == null) {
            instance = new SingLeton();
        }
        return instance;
    }
}