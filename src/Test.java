public class Test {
    public static void main(String[] args){
        testDataProcessor test1 = new testDataProcessor();
        TestHash test2 = new TestHash();
        TestUser test3 = new TestUser();
        test1.DataTest1();
        test1.DataTest2();
        test2.putAndGetTest();
        test2.resizeTest();
        test2.clearTest();
        test2.exceptionTest();
        test2.removeTest();
        test3.UserTest1();
        test3.UserTest2();
        test3.UserTest3();


    }
}
