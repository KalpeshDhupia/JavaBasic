public class VehicleDrive {
    public static void main(String[] args) {
        FourWheeler fourWheeler = new FourWheeler();
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.start();
        twoWheeler.stop();
        fourWheeler.start();
        fourWheeler.stop();
    }
}
