package Pełnomocnik;

public class Consumer {
    private String email;
    private String password;

    public Consumer(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
