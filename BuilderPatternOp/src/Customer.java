import java.util.ArrayList;
import java.util.List;

/**
 * The `Customer` class in Java represents a customer with properties such as
 * age, name, gender,
 * address, and phone numbers, and includes a builder pattern implementation for
 * creating instances of
 * the class.
 */
public class Customer {

    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Integer> phones;

    public Customer() {
    }

    public Customer(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Customer(int age, String name, String gender, Address address, List<Integer> phones) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhones(List<Integer> phones) {
        this.phones = phones;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public List<Integer> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Customer [age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address + ", phones="
                + phones + "]";
    }

    public static class CustomerBuilder implements IBuilder<Customer> {

        private int age;
        private String name;
        private String gender;
        private Address address;
        private final List<Integer> phones = new ArrayList<>();

        public CustomerBuilder() {
        }

        public CustomerBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public CustomerBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public CustomerBuilder setPhone(Integer phoneNumber) {
            this.phones.add(phoneNumber);
            return this;
        }

        @Override
        public Customer build() {
            return new Customer(age, name, gender, address, phones);
        }

        @Override
        public String toString() {
            return "Customer [age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address
                    + ", phones="
                    + phones + "]";
        }

    }
}
