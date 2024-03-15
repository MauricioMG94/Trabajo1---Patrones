class Interaction implements InteractionPrototype {
    private String clientId;
    private String observations;
    private String state;

    public Interaction(String clientIdentifier, String observations, String state) {
        this.clientId = clientIdentifier;
        this.observations = observations;
        this.state = state;
    }

    @Override
    public InteractionPrototype clone() {
        return new Interaction(clientId, observations, state);
    }
}



