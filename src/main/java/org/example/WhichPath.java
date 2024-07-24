package org.example;

public class WhichPath {

    public static String makeDecision(int x, int y, int z) {
        if (x > 10) {
            if (y < 5) {
                if (z == 0) {
                    return "Path 1";
                } else if (z > 0 && z < 10) {
                    return "Path 2";
                } else {
                    return "Path 3";
                }
            } else {
                if (z > 10) {
                    return "Path 4";
                } else {
                    return "Path 5";
                }
            }
        } else {
            if (y > 5) {
                if (z < -10) {
                    return "Path 6";
                } else if (z == -10) {
                    return "Path 7";
                } else {
                    return "Path 8";
                }
            } else {
                return "Path 9";
            }
        }
    }
}
