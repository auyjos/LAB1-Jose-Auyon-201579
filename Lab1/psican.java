
/**

public class psican {
    private void psican(Persona p) {
        this.animo = (1.0 / p.getConfiabilidad()) * (rand.nextFloat() - 0.5) * 10 + this.animo;
        if(p.tieneGalleta()){
            p.darGalleta();
            this.animo += (1.0/p.getConfiabilidad()) * (rand.nextInt(2));
        }
        System.out.println("Mi nuevo animo es: " + animo );
    }
}
 **/