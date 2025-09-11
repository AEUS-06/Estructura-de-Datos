package TDA_esfera;

public class TDA_esfera {
    private double radio; //atributo tipo privado

    //construtor para inicializar el radio
    public TDA_esfera(double radioinicial) {
        if (radioinicial > 0) {
            radio = radioinicial;
        } else {
            radio = 0.0; //valor por defecto
        }
    }

    //Metodos para TDA
    public double getRadio() {;
        return this.radio;
    }
    public double getDiametro() {
        return (radio * 2);
    }
    public double getCircunferencia() {
        return (Math.PI * getDiametro());
    }
    public double getArea() {
        return (4 * Math.PI * radio * radio);
    }
    public double getVolumen() {
        return (4 * Math.PI * Math.pow(radio, 3) / 3);
    }

}
