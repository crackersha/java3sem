package prak4.task3;

public enum Users {
    Sonya(16062003),
    Vanya(12345),
    Crackersha(137456);

    private final int password;

    private Users(int password){
        this.password = password;
    }

    public int getPassword() {
        return password;
    }
}
