package pl.sda.configuration;

import java.util.UUID;

public class DuplicateUUID {

    private static final UUID theUUID = UUID.randomUUID();

    public static void main(String[] args) {
        UUID generatedUUID = UUID.randomUUID();
        int i = 1;

        while (!generatedUUID.equals(theUUID)) {
            generatedUUID = UUID.randomUUID();
            System.out.println(i++);
        }
        System.out.println("the UUID: " + theUUID);
        System.out.println("matches generated UUID: " + generatedUUID);
    }
}
