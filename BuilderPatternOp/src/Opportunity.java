import java.util.List;

public class Opportunity {

    private Integer id;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private double amount;
    private Customer customer;

    public Opportunity() {
    }

    public Opportunity(Integer id, String name, String description, String startDate, String endDate, double amount,
            Customer customer) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Opportunity [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
                + ", endDate=" + endDate + ", amount=" + amount + ", customer=" + customer + "]";
    }

    public static class OpportunityBuilder implements IBuilder<Opportunity> {

        private Integer id;
        private String name;
        private String description;
        private String startDate;
        private String endDate;
        private double amount;
        private Customer customer;

        public OpportunityBuilder(){
        }
        
        public OpportunityBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public OpportunityBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public OpportunityBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public OpportunityBuilder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public OpportunityBuilder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public OpportunityBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public OpportunityBuilder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public OpportunityBuilder setCustomer(int age, String name, String gender, Address address, List<Integer> phones) {
            this.customer = new Customer(age, name, gender, address, phones);
            return this;
        }

        @Override
        public Opportunity build() {
            return new Opportunity(id, name, description, startDate, endDate, amount, customer);
        }

    }

}
