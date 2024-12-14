public class Decisiones {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

       if (fechaDeLanzamiento >= 2022){
           System.out.println("Pelicula más populares");
       }else {
           System.out.println("Pelicula Retro que aun vale la pena ver :) ");
       }

       if (incluidoEnElPlan && tipoPlan.equals("plus")){
           System.out.println("Disfruta de la pelicula :) ");
       } else {
           System.out.println("Pelicula no disponible para su plan :( ");
       }
    }
}
