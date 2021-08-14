import java.util.Random;

public class Perro {
    double animo;
    double umbral;
    int maxUmbral = 20;
    int minUmbral = 0;
    int minAnimo = -5;
    int maxAnimo = 5;

    public Perro() {

        umbral = (Math.random() * ((this.maxUmbral - this.minUmbral) + 1)) + this.minUmbral;

        animo = (Math.random() * ((this.maxAnimo - this.minAnimo) + 1)) + this.minAnimo;

        System.out.println("El ánimo del perro es: " + animo);
        System.out.println("El umbral del perro es : " + umbral);
    }

    public void psican(Persona p) {
        Random rand = new Random();
        this.animo = ((1.0 / p.getConfiabilidad()) * (rand.nextFloat() - 0.5) * 10) + this.animo;
        if (p.tieneGalleta()) {
            p.darGalleta();
            this.animo += (1.0 / p.getConfiabilidad()) * (rand.nextInt(2));
            if (this.animo >= this.maxAnimo) {
                this.animo = this.maxAnimo;
            }
        }
        System.out.println("Mi nuevo animo es: " + animo);
    }

    public void acciones() {
        if (this.animo < 3 && this.animo >= 0) {
            System.out.println("El perro le ladra a la persona");
        } else if (this.animo < 0) {
            System.out.println("El perro muerde a la persona");
        } else if (this.animo >= 3) {
            System.out.println("El perro mueve la cola");
        }
    }
}
