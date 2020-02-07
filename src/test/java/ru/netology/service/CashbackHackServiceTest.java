package ru.netology.service;

import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CashbackHackServiceTest {

    @Test
void shouldReturn100IfAmount900() {
    CashbackHackService service = new CashbackHackService();
    int amount = 900;
    int actual = service.remain(amount);
    int expected = 100;
    assertEquals(expected, actual);

}

    @Test
    void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }
//    @Test
//    void shouldReturn0IfAmount2000() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 2000;
//        int actual = service.remain(amount);
//        int expected = 0;
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    void shouldReturnExeptionIfAmountMinus200()  {
//        CashbackHackService service = new CashbackHackService();
//        int amount = -200;
//
//        assertThrows(RuntimeException.class, ()-> {service.remain(amount);} );
//    }
}