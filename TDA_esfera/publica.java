package TDA_esfera;

public class publica {
    public static void main(String[] args) {
        TDA_esfera esfera1 = new TDA_esfera(5.0);

        System.out.println("Radio: " + esfera1.getRadio());
        System.out.println("Diametro: " + esfera1.getDiametro());
        System.out.println("Circunferencia: " + esfera1.getCircunferencia());
        System.out.println("Area: " + esfera1.getArea());
        System.out.println("Volumen: " + esfera1.getVolumen());
    }
}
