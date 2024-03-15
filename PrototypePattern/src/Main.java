public class Main {
    public static void main(String[] args) {
        // Crea prototipo de interacción con datos iniciales
        InteractionPrototype prototype = new ConcreteInteractionPrototype("EM-101", "OF-205", "Calle 100 #35-68, Bogotá");

        // Clonar el prototipo
        ConcreteInteractionPrototype clonedInteraction_1 = (ConcreteInteractionPrototype) prototype.clone();

        // Modificar valores
        clonedInteraction_1.setClientId("CLI-1652");
        clonedInteraction_1.setObservations("Visitar al cliente en sitio de trabajo CC Unicentro, mañana 2 pm.");
        clonedInteraction_1.setState("Abierta");

        // Imprimir valores
        System.out.println("Interacción: " + clonedInteraction_1);

        ConcreteInteractionPrototype clonedInteraction_2 = (ConcreteInteractionPrototype) prototype.clone();

        // Modificar valores
        clonedInteraction_2.setClientId("Cli-389");
        clonedInteraction_2.setObservations("Cliente adquirió una tarjeta de crédito platinum.");
        clonedInteraction_2.setState("Cerrada");

        System.out.println("Interacción: " + clonedInteraction_2);
    }
}




