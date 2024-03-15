class ConcreteInteractionPrototype implements InteractionPrototype {
    private String employeeId;
    private String officeId;
    private String address;
    private String clientId;
    private String observations;
    private String state;

    public ConcreteInteractionPrototype(String employeeId, String officeId, String address) {
        this.employeeId = employeeId;
        this.officeId = officeId;
        this.address = address;
    }

    @Override
    public InteractionPrototype clone() {
        return new ConcreteInteractionPrototype(employeeId, officeId, address);
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setObservations(String interactionNotes) {
        this.observations = interactionNotes;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  " Employee Code='" + employeeId + '\'' +
                ", Office Code='" + officeId + '\'' +
                ", Office Address='" + address + '\'' +
                ", Client Id='" + clientId + '\'' +
                ", Observations='" + observations + '\'' +
                ", State='" + state + '\'' +
                '}';
    }
}

