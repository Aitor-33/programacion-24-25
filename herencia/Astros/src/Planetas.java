public class Planetas extends Astros{

    private double distanciaSol;
    private double  orbitaSolar;
    private boolean poseeSatelites;

    public Planetas(double  masaDelCuerpo, double  diametroMedio, double  periodoRotacionHoras, double  periodoTraslacionHoras, double  distanciaMedia,double distanciaSol, double  orbitaSol, boolean tieneSatelites){

        super(masaDelCuerpo,diametroMedio,periodoRotacionHoras,periodoTraslacionHoras,distanciaMedia);

        this.distanciaSol = distanciaSol;
        this.orbitaSolar = orbitaSol;
        this.poseeSatelites = tieneSatelites;
    
    }

    
    public double getDistanciaSol() {
    
        return distanciaSol;
    
    }

    public double getOrbitaSol() {
    
        return orbitaSolar;
    
    }

    public boolean isTieneSatelites() {
    
        return poseeSatelites;
    
    }

    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("planeta");

        sb.append("la masa del cuerpo es = ").append(super.getMasaDelCuerpo());

        sb.append(", el diametro medio es =").append(super.getDiametroMedio());

        sb.append(", el periodo de rotacion es = ").append(super.getDistanciaMedia());

        sb.append(", el periodo de traslacion es = ").append(super.getPeriodoRotacionHoras());

        sb.append(", la distancia media es = ").append(super.getPeriodoTraslacionHoras());

        sb.append(", la distancia del sol es = ").append(this.distanciaSol);

        sb.append(", la orbita solar es = ").append(this.orbitaSolar);

        sb.append(", ¿posee algun satelite? = ").append(this.poseeSatelites);

        return sb.toString();
    }





}
