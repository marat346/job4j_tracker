package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                throw new UserInvalidException("Юзер не прошел валидацию");
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {

        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Юзер не прошел валидацию");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };

        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException a) {
            a.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}





