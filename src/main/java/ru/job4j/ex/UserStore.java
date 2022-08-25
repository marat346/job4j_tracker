package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                System.out.println(login);
            }
        }
        return null;
    }


    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() || String.length(user)) {
        }
        return false;
    }


    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };

        try {
            User user = findUser(users, "Petr Arsentev");
            if (findUser(false,"Petr Arsentev")) {
                System.out.println("This user has an access");
            }
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }catch (UserInvalidException a) {
            a.printStackTrace();
        }
    }
}




