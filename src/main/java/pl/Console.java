package pl;

public class Console {

    private static final String query = """
            CREATE DATABASE workshop3
                CHARACTER SET utf8mb4
                COLLATE utf8mb4_unicode_ci;
                        
            CREATE TABLE users
            (
                id       INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
                email    VARCHAR(255) UNIQUE NOT NULL,
                username VARCHAR(255)        NOT NULL,
                password VARCHAR(60)         NOT NULL
            );          
            """;

}
