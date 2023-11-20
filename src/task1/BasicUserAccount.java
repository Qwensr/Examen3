package task1;

class BasicUserAccount implements UserAccount {

        private String[] usernames;
        private String[] passwords;
        private int size;

        BasicUserAccount(int capacity) {
            this.usernames = new String[capacity];
            this.passwords = new String[capacity];
            this.size = 0;
        }

        @Override
        public void createAccount(String username, String password) {
            if (size < usernames.length) {
                usernames[size] = username;
                passwords[size] = password;
                size++;
                System.out.println("Аккаунт создан " + username);
            } else {
                System.out.println("Аккаунт не может быть дополнен,Потому что он переполнен");
            }
        }

        @Override
        public void updateAccount(String username, String newPassword) {
            int index = findUserIndex(username);
            if (index != -1) {
                passwords[index] = newPassword;
                System.out.println("Аккаунт обнавлен " + username);
            } else {
                System.out.println("Аккаунт не найден " + username);
            }
        }

        @Override
        public void deleteAccount(String username) {
            int index = findUserIndex(username);
            if (index != -1) {
                usernames[index] = null;
                passwords[index] = null;
                size--;
                System.out.println("Аккаунт удален " + username);
            } else {
                System.out.println("Аккаунт не был найден " + username);
            }
        }

        private int findUserIndex(String username) {
            for (int i = 0; i < size; i++) {
                if (usernames[i] != null && usernames[i].equals(username)) {
                    return i;
                }
            }
            return -1;
        }
    }





