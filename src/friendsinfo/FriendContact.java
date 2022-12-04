package friendsinfo;

public class FriendContact {
    private String fName = "";
    private String mName = "";
    private String lName = "";
    private int id = 0;
    private String email  = ""; 
    private String phone = "";

    public FriendContact() {
    }

    public FriendContact(String fName, String mName, String lName, int id, String email, String phone) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "FriendContact{" + "fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", id=" + id + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
    
    
}
