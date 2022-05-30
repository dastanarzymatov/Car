public class Car implements AutoCloseable {

    public  void drive(){
        System.out.println(" mashina jurgonu atat ");
    }

    @Override
    public void close() throws Exception {
        System.out.println("mashina jabylyp jatat");
    }
}
