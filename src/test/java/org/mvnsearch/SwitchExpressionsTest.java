package org.mvnsearch;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

/**
 * Switch Expressions test
 *
 * @author linux_china
 */
public class SwitchExpressionsTest {

    @Test
    public void testArrayLabels() {
        //legacy
        switch (DayOfWeek.FRIDAY) {
            case MONDAY: {
                System.out.println(1);
                break;
            }
            case WEDNESDAY: {
                System.out.println(2);
                break;
            }
            default: {
                System.out.println("Unknown");
            }
        }
        //Arrow labels
        switch (DayOfWeek.FRIDAY) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY -> System.out.println(7);
            case THURSDAY, SATURDAY -> System.out.println(8);
            case WEDNESDAY -> System.out.println(9);
        }
    }

    @Test
    public void testExpressions() {
        //Switch expressions
        int i = switch (DayOfWeek.FRIDAY) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
        //Yielding a value
        int i2 = switch (DayOfWeek.FRIDAY) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> {
                yield 10;
            }
        };
    }

    private int workWeekDays(DayOfWeek s) {
        return switch (s) {
            case MONDAY:
                yield 1;
            case TUESDAY:
                yield 2;
            case WEDNESDAY:
                yield 3;
            case THURSDAY:
                yield 4;
            case FRIDAY:
                yield 5;
            default:
                System.out.println("Seems that the selected day is weekend");
                yield 0;
        };
    }
}
