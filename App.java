public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double descuento = 0.15;
        float precioPantalon = 30;
        float   precioCamisa = 25;
        double descuentoPantalon = (precioPantalon) * descuento;
        double descuentoCamisa = (precioCamisa) * descuento;
        double  preciototal = (descuentoPantalon+descuentoCamisa);
        double cantidadPantalon=2;
        double cantidadCamisas=2;
        double descuentoAdicional=descuentoCamisa*(1-0.05);
        ut (descuentoPantalon*cantidadPantalon+descuentoCamisa+descuentoAdicional);

    }
}
