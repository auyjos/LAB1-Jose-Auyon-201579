public class Persona {
    private int numGalleta;
    private int confiabilidad;
    int numMax = 10;
    int numMin = 0;


    public Persona() {
        confiabilidad = (int) Math.floor((Math.random() * ((this.numMax - this.numMin) + 1)) + this.numMin);
        numGalleta = (int) Math.floor((Math.random() * ((this.numMax - this.numMin) + 1)) + this.numMin);

        System.out.println("Mi confiabilidad: " + confiabilidad);
        System.out.println("Galleta: " + numGalleta);
    }

    public boolean tieneGalleta() {
        return this.numGalleta != 0;
    }

    public int getConfiabilidad() {
        return this.confiabilidad;
    }

    public void darGalleta() {
        if (tieneGalleta()) {
            this.numGalleta = this.numGalleta - 1;

        }
    }

    public void reacciones(Perro r) {
        if (r.animo < 3 && r.animo >= 0) {
            System.out.println("la  persona se asusta");
        } else if (r.animo < 0) {
            System.out.println(" La persona comienza a sangrar");
        } else if (r.animo >= 3) {
            System.out.println("La persona se lo lleva a su casa");
        }
    }
}


