package com.atzitz.gymhelper.internal.data

import java.time.LocalTime

enum class Period(equivalent: Int, start: LocalTime, end: LocalTime) {
    P1(1, LocalTime.of(8, 15), LocalTime.of(9, 0)),
    P2(2, LocalTime.of(9, 10), LocalTime.of(9, 55)),
    P3(3, LocalTime.of(10, 15), LocalTime.of(11, 0)),
    P4(4, LocalTime.of(11, 10), LocalTime.of(11, 55)),
    P5(5, LocalTime.of(12, 5), LocalTime.of(12, 50)),
    P6(6, LocalTime.of(12, 55), LocalTime.of(13, 40)),
    P7(7, LocalTime.of(13, 50), LocalTime.of(14, 35)),
    P8(8, LocalTime.of(14, 45), LocalTime.of(15, 30)),
    P9(9, LocalTime.of(15, 40), LocalTime.of(16, 25)),
    P10(10, LocalTime.of(16, 35), LocalTime.of(17, 20)),
    P11(11, LocalTime.of(17, 30), LocalTime.of(18, 15))

}