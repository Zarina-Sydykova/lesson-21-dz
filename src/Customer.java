import java.time.LocalDate;

public class Customer implements ServiceAble{
    private String name;
    private String surname;
    private Country country;
    private LocalDate dateOfyears;
    private String email;

    public Customer(String name, String surname, Country country, LocalDate dateOfyears, String email) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.dateOfyears = dateOfyears;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDateOfyears() {
        return dateOfyears;
    }

    public void setDateOfyears(LocalDate dateOfyears) {
        this.dateOfyears = dateOfyears;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country=" + country +
                ", dateOfyears=" + dateOfyears +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public LocalDate getAge(Customer[] customers) {
        return null;
    }
}
