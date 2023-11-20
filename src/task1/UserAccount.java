package task1;

public interface UserAccount {
    void createAccount(String username,String password);
    void deleteAccount(String username);
    void updateAccount(String username,String newPassword);

}
