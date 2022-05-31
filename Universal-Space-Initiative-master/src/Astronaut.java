public class Astronaut {
    private String name;
    private String birth;
    private int serialNumber;
    private String address;
    private String email;
    private String phoneNumber;
    private double payRate;
    private int weight;
    private String nextOfKin;

    public Astronaut(String name, String birth, String address, String email, String phone, double payRate, int weight,
            String nextOfKin, int serialNumber) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.email = email;
        this.phoneNumber = phone;
        this.payRate = payRate;
        this.weight = weight;
        this.nextOfKin = nextOfKin;
        this.serialNumber = serialNumber;
    } // constructor

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the birth
     */
    public String getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }

    /**
     * @return int return the serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return double return the payRate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * @param payRate the payRate to set
     */
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    /**
     * @return int return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return String return the nextOfKin
     */
    public String getNextOfKin() {
        return nextOfKin;
    }

    /**
     * @param nextOfKin the nextOfKin to set
     */
    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

}
