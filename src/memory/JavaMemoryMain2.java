package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main 시작");
        method1();
        System.out.println("main 끝");
    }

    static void method1() {
        System.out.println("method1 시작");
        Data data = new Data(10);
        method2(data);
        System.out.println("method1 끝");
    }

    static void method2(Data data) {
        System.out.println("method2 시작");
        System.out.println(data.getValue());
        System.out.println("method2 끝");
    }
}
