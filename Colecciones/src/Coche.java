public class Coche {

    public String color;
    public String marca;

    public Coche(String color, String marca) {

        this.color = color;
        this.marca = marca;

    }

    public String getColor() {

        return color;

    }

    public String getMarca() {

        return marca;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("\ncoche\n");
        sb.append("el color del coche es = ").append(color);
        sb.append(" la marca del coche es = ").append(marca);

        return sb.toString();

    }




    
}
