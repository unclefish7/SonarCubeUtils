public class ExcPos2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            // 错误处理：只打印 message，未记录异常栈，未恢复逻辑
            logger.println("Something went wrong: " + e.getMessage());
        }
    }

    public static void doSomething() {
        throw new CustomException("内部异常");
    }
}
