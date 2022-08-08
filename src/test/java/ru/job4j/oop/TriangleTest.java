package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void when00and10and01Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(0, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(0.499, 0.001));
    }

    @Test
    public void when00and10and10ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(-1, 0.001));
    }

}