public class Satelites extends Astros{
    private double distanciaPlaneta;
    private double orbitaPlaneta;
    private String planetaPerteneciente;

    public Satelites(double  masaDelCuerpo, double  diametroMedio, double  periodoRotacionHoras, double  periodoTraslacionHoras, double  distanciaMedia,double distanciaPlaneta, double  orbitaPlaneta, String planetaPerteneciente){

        super(masaDelCuerpo,diametroMedio,periodoRotacionHoras,periodoTraslacionHoras,distanciaMedia);

        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlaneta = orbitaPlaneta;
        this.planetaPerteneciente = planetaPerteneciente;

    }

    public double  getDistanciaPlaneta() {

        return distanciaPlaneta;

    }

    public double  getOrbitaPlaneta() {

        return orbitaPlaneta;

    }

    public String getPlanetaPerteneciente() {

        return planetaPerteneciente;

    }

    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("satelite");

        sb.append("la masa del cuerpo es = ").append(super.getMasaDelCuerpo());

        sb.append(", el diametro medio es = ").append(super.getDiametroMedio());

        sb.append(", el periodo de rotacion es = ").append(super.getDistanciaMedia());

        sb.append(", el periodo de traslacion es = ").append(super.getPeriodoRotacionHoras());

        sb.append(", la distancia media es = ").append(super.getPeriodoTraslacionHoras());

        sb.append(", la distancia respecto al planeta es = ").append(this.distanciaPlaneta);

        sb.append(", la orbita al planeta es = ").append(this.orbitaPlaneta);

        sb.append(", ¿a que planeta pertenece? = ").append(this.planetaPerteneciente);

        return sb.toString();

    }

}
