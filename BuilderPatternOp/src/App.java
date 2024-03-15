
public class App {

    public static void main(String[] args) throws Exception {

        /* se crea una instancia de OpportunityBuilder y se utilizan métodos encadenados para establecer las diferentes propiedades del objeto Opportunity, 
        como el ID, nombre, cantidad, descripción, fecha de inicio y fecha de finalización. Además, se utiliza otro Builder interno para construir un objeto 
        Customer que representa la información del cliente asociado a esta oportunidad. Se establecen las propiedades del cliente, como nombre, edad, género, 
        teléfono y dirección. Finalmente, se llama al método build() tanto en el OpportunityBuilder como en el CustomerBuilder para obtener las instancias 
        completas de Opportunity y Customer, respectivamente. */
        Opportunity opportunity = new Opportunity.OpportunityBuilder()
                .setId(1)
                .setName("Campaña 1 Leasing")
                .setDescription("Leasing habitacional")
                .setAmount(120000000)
                .setDescription("Inmueble a manera de arrendamiento por un tiempo determinado")
                .setStartDate("07-03-2024")
                .setEndDate("07-03-2025")
                .setCustomer(new Customer.CustomerBuilder()
                    .setAge(24)
                    .setName("Cristian Jaimes")
                    .setGender("M")
                    .setPhone(31879279)
                    .setPhone(32161222)
                    .setAddress(new Address("MZ 62 LT 15", "Cartagena", "Colombia", "201035"))
                    .build())
                .build();
        /* Imprimir el objeto Opportunity */
        System.out.println(opportunity);
    }
}
