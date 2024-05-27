package Contact;

class Call {
    private String contactName;
    private String contactNumber;
    private int count = 0;

    public Call(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void incrementCount() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}