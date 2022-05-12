package types;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PersonTest {

    Person p;

    @BeforeEach
    void setUp() {
        p = new Person();
        p.setCorreo("marcsemperlloret@gmail.com");
        p.setDNI("23431435J");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDNI() {
        assertEquals("marcsemperlloret@gmail.com", p.getCorreo());
    }

    @Test
    void setDNI() {
    }

    @Test
    void getCorreo() {
    }

    @Test
    void setCorreo() {
    }
}