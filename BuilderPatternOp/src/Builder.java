
public class Builder {
    
    private Integer id;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private double amount;

    public Builder(Integer id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Builder id(Integer id) {
        this.id = id;
        return this;
    }

    public Builder name(String name) {
        this.name = name;
        return this;
    }
    
    public Builder description(String description) {
        this.description = description;
        return this;
    }

    public Builder startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public Builder endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Builder amount(double amount) {
        this.amount = amount;
        return this;
    }

    //* Método para construir el objeto Opportunity utilizando el Builder */ 
    public Opportunity build() {
        return new Opportunity(id, name, description, startDate, endDate, amount);
    }

    @Override
    public String toString() {
        return "Builder [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
                + ", endDate=" + endDate + ", amount=" + amount + "]";
    }

    
}
