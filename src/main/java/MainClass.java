import guru.springframework.model.User;

public class MainClass {
    public static void main(String[] args) {
        User user = User.builder().firstName("aksh").lastName("gujju").email("a2@ad.com").build();

        System.out.println(user);

    }
}
