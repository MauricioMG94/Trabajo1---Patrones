public class App {

    public static void main(String[] args) throws Exception {
        
        /* builder con pamaetros obligatorios, Identificador, Nombre y valor */
        Builder builder = new Builder(123, "Targeta de Crédito", 6500000.00 );
        /* Parametros opcionales */
        builder.startDate("2024-03-05");
        builder.endDate("2026-03-05");
        builder.description("Targeta de credito aprovada");
        /* Construccion del objeto */
        Opportunity opportunity = builder.build();
        /*  Imprimir el objeto Opportunity */
        System.out.println(opportunity);

    }
}
