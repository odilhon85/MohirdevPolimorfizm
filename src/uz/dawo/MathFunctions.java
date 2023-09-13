package uz.dawo;

public class MathFunctions {

    //    add methods
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public byte add(byte num1, byte num2) {
        return (byte) (num1 + num2);
    }

    public short add(short num1, short num2) {
        return (short) (num1 + num2);
    }

    public long add(long num1, long num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return (num1 + num2);
    }

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    //          sub methods
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public byte sub(byte num1, byte num2) {
        return (byte) (num1 - num2);
    }

    public short sub(short num1, short num2) {
        return (short) (num1 - num2);
    }

    public long sub(long num1, long num2) {
        return num1 - num2;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public float sub(float num1, float num2) {
        return num1 - num2;
    }

    //              multiply methods
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public byte multiply(byte num1, byte num2) {
        return (byte) (num1 * num2);
    }

    public short multiply(short num1, short num2) {
        return (short) (num1 * num2);
    }

    public long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    //              div methods
    public int div(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    public byte div(byte num1, byte num2) {
        if (num2 == 0) return 0;
        return (byte) (num1 / num2);
    }

    public short div(short num1, short num2) {
        if (num2 == 0) return 0;
        return (short) (num1 / num2);
    }

    public long div(long num1, long num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    public double div(double num1, double num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    public float div(float num1, float num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    //    abs methods
    public int abs(int num1) {
        return Math.abs(num1);
    }

    public byte abs(byte num1) {
        return (byte) Math.abs(num1);
    }

    public short abs(short num1) {
        return (short) Math.abs(num1);
    }

    public long abs(long num1) {
        return Math.abs(num1);
    }

    public double abs(double num1) {
        return Math.abs(num1);
    }

    public float abs(float num1) {
        return Math.abs(num1);
    }

    //    pow methods
    public int pow(int num1) {
        return (int) Math.pow(num1, 2);
    }

    public byte pow(byte num1) {
        return (byte) Math.pow(num1, 2);
    }

    public short pow(short num1) {
        return (short) Math.pow(num1, 2);
    }

    public long pow(long num1) {
        return (long) Math.pow(num1, 2);
    }

    public double pow(double num1) {
        return Math.pow(num1, 2);
    }

    public float pow(float num1) {
        return (float) Math.pow(num1, 2);
    }
}
