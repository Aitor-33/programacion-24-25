public class Astros {

    private double  masaDelCuerpo;
    private double  diametroMedio;
    private double  periodoRotacionHoras;
    private double  periodoTraslacionHoras;
    private double distanciaMedia;

    public Astros(double  masaDelCuerpo, double  diametroMedio, double  periodoRotacionHoras, double  periodoTraslacionHoras, double  distanciaMedia) {

        this.masaDelCuerpo = masaDelCuerpo;
        this.diametroMedio = diametroMedio;
        this.periodoRotacionHoras = periodoRotacionHoras;
        this.periodoTraslacionHoras = periodoTraslacionHoras;
        this.distanciaMedia = distanciaMedia;

    }

    public double getMasaDelCuerpo() {

        return masaDelCuerpo;

    }

    public double getDiametroMedio(){

        return diametroMedio;

    }

    public double getPeriodoRotacionHoras() {

        return periodoRotacionHoras;

    }

    public double getPeriodoTraslacionHoras() {

        return periodoTraslacionHoras;

    } 
    
    public double getDistanciaMedia(){

        return this.distanciaMedia;

    }

    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("astro");

        sb.append("la masa del cuerpo es = ").append(masaDelCuerpo);

        sb.append(", el diametro medio es = ").append(diametroMedio);

        sb.append(", el periodo de rotacion es = ").append(periodoRotacionHoras);

        sb.append(", el periodo de trastacion es = ").append(periodoTraslacionHoras);

        sb.append(", la distancia media es = ").append(distanciaMedia);
        
        return sb.toString();

    }

}
