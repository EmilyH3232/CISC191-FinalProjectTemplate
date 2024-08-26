package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TestNumArray {
    NumArray tes;

    @BeforeEach
    void setUp() {
        tes = new NumArray();


    }

    @Test
    void getFirst() {
        assertEquals(1, tes.getFirst());
    }
}