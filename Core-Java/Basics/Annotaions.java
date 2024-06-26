import java.lang.annotation.*;

@Repeatable(Roles.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Role {
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Roles {
    Role[] value();
}

public class Annotaions {

    @Role(name = "Admin")
    @Role(name = "Manager")
    public void performRole() {
        // Method implementation
    }

    public static void main(String[] args) throws Exception {
        Annotaions example = new Annotaions();
        example.performRole();

        // Retrieving annotations at runtime
        Roles roles = example.getClass().getMethod("performRole").getAnnotation(Roles.class);
        for (Role role : roles.value()) {
            System.out.println("Role: " + role.name());
        }
    }
}

