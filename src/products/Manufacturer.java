package products;
/**
 *
 * @author Kojak
 */
public class Manufacturer {
    String manuName, manuAddress, manuPostalCode, manuPhoneNumber;

    public Manufacturer(String manuName, String manuAddress, String manuPostalCode, String manuPhoneNumber) {
        this.manuName = manuName;
        this.manuAddress = manuAddress;
        this.manuPostalCode = manuPostalCode;
        this.manuPhoneNumber = manuPhoneNumber;
    }

//Mutators
    public void setManuName(String manuName) {
        this.manuName = manuName;
    }
    public void setManuAddress(String manuAddress) {
        this.manuAddress = manuAddress;
    }
    public void setManuPostalCode(String manuPostalCode) {
        this.manuPostalCode = manuPostalCode;
    }
    public void setManuPhoneNumber(String manuPhoneNumber) {
        this.manuPhoneNumber = manuPhoneNumber;
    }

    //Accessors
    public String getManuName() {
        return manuName;
    }
    public String getManuAddress() {
        return manuAddress;
    }
    public String getManuPostalCode() {
        return manuPostalCode;
    }
    public String getManuPhoneNumber() {
        return manuPhoneNumber;
    }

    //String override
    public String toString(){
        return "\nManufacturer Name: " + getManuName() +
                "\nManufacturer Address" + getManuAddress() +
                "\nManufacturer Postal Code: " + getManuPostalCode() +
                "\nManufacturer Phone Number: " + getManuPhoneNumber() + "\n";
    }
}