public class SingLeton {

    // ��̬��instance���󣬱�֤ȫ��Ψһ��
    private static SingLeton instance = null;

    // ˽�еĹ��캯������ֹ�ⲿ��new�ؼ��ִ���ʵ������
    private SingLeton() {

    }

    // ����Ĺ�����̬ʵ�����������༶��ֱ�ӿ��Ե��ô˷���
    public static SingLeton getInstance() {

        // ͨ���ж�instance�Ƿ�Ϊnull�������Ƿ񴴽�����
        if (instance == null) {
            instance = new SingLeton();
        }
        return instance;
    }
}