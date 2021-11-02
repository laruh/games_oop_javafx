package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        assertEquals(Cell.A1, bishopBlack.position());
    }

    @Test
    public void way() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(steps, bishopBlack.way(Cell.G5));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void isDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G3);
    }

    @Test
    public void copy() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        Figure bishopBlack1 = new BishopBlack(Cell.B1);
        assertEquals(bishopBlack1.position(), bishopBlack.copy(Cell.B1).position());
    }
}