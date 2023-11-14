public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String postal_code;
    private String city;
    private int licence_number;
    private int year_of_issue;
    private char category;

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLicence_number(int licence_number) {
        this.licence_number = licence_number;
    }

    public void setYear_of_issue(int year_of_issue) {
        if(year_of_issue >=1980 && year_of_issue <=2023){
            this.year_of_issue = year_of_issue;
        }
        

    }

    public void setCategory(char category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getCity() {
        return city;
    }

    public int getLicence_number() {
        return licence_number;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public char getCategory() {
        return category;
    }

    

    @Override
    public String toString() {
        return "DrivingLicence [name=" + name + ", surname=" + surname + ", address=" + address + ", postal_code="
                + postal_code + ", city=" + city + ", licence_number=" + licence_number + ", year_of_issue="
                + year_of_issue + ", category=" + category + "]";
    }
    
    public void Display(){
        System.out.println(toString());
    }
}
