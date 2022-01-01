public class Student {
    String name,gmail;
    int moodle_id;
           int contact;
    Student(String name, int moodle_id, String gmail, int contact){
        this.name= name;
        this.moodle_id=moodle_id;
        this.gmail=gmail;
        this.contact= contact;
    }

    public Student() {

    }

    public static void main(String[] args) {

    }

    public String getname() {
    return name;
    }

    public String getmoodle_id() {
        return String.valueOf(moodle_id);
    }

    public String getgmail() {
   return gmail;
    }

    public long getcontact() {
        return contact;
    }

    public void setname(String string) {

    }

    public void setmoodle_id(String string) {
    }

    public void setgmail(String string) {
    }

    public void setcontact(String string) {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return null;
    }

    public String getEmail() {
        return gmail;
    }

    public String getContactno() {
        return null;
    }

    public char[] getId() {
        return new char[0];
    }

    public String getCourse() {
        return null;
    }

    public int getFee() {
        return 0;
    }

    public int getPaid() {
        return 0;
    }

    public int getDue() {
        return 0;
    }

    public String getAddress() {
        return null;
    }

    public String getCity() {
        return null;
    }

    public String getState() {
        return null;
    }

    public String getCountry() {
        return null;
    }

    public int getRollno() {
        return 0;
    }

    public void setRollno(int rollno) {
    }

    public void setName(String name) {
    }

    public void setEmail(String email) {
    }

    public void setCourse(String course) {
    }

    public void setFee(int fee) {
    }

    public void setDue(int due) {
    }

    public void setPaid(int paid) {
    }

    public void setAddress(String address) {
    }

    public void setCity(String city) {
    }

    public void setState(String state) {
    }

    public void setCountry(String country) {
    }

    public void setContactno(String contactno) {
    }
}
