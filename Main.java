package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        float number = 3.54f;
//        int bits = Float.floatToIntBits(number);
//        System.out.println(0 + Integer.toBinaryString(Float.floatToIntBits((float) a)));
//        System.out.println(0 + Long.toBinaryString(Float.floatToIntBits(number)));

//        System.out.println(0 + Long.toBinaryString(Double.doubleToRawLongBits(4.6)));
//        System.out.println(Long.toBinaryString(Double.doubleToLongBits(4.6)));

//        Locale aLocale = new Locale.Builder().setLanguage("sr").setScript("Latn").setRegion("US").setVariant("ENGLISH").build();
//        String str="79,1";
//        str=str.replace(',','.');
//        System.out.print(str);

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите число, дробное через точку, пожалуйста:");

        if (sc.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать целое число
            double a = sc.nextDouble(); // считывает целое число с потока ввода и сохраняем в переменную

            if (a % 1 == 0) {
                for (; ; ) {
                    String LengthBinaryNumber = Binar((long) a);  // Бинарное  положительное число
                    int Byt = 8 - LengthBinaryNumber.length();  // Вычисляем сколько нулей должно остаться в типе Byte
                    int Sho = 16 - LengthBinaryNumber.length();
                    int In = 32 - LengthBinaryNumber.length();
                    int Lon = 64 - LengthBinaryNumber.length();
                    int Flo = 32 - LengthBinaryNumber.length();
                    int Dou = 64 - LengthBinaryNumber.length();

                    String LengthNegBinaryNumber = NegBinar((long) a);  // Бинарная дилина отрицательного числа
                    int NegByt = 7 - LengthNegBinaryNumber.length();  // Вычисляем сколько нулей должно остаться в типе Byte
                    int NegSho = 15 - LengthNegBinaryNumber.length();
                    int NegIn = 31 - LengthNegBinaryNumber.length();
                    int NegLon = 63 - LengthNegBinaryNumber.length();
                    int NegFlo = 31 - LengthNegBinaryNumber.length();
                    int NegDou = 63 - LengthNegBinaryNumber.length();

                    if (a >= 0) {
                        if (a <= 127) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Byte Short Int Long Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Byte") || (Input.equals("byte"))) {
                                    System.out.println("Byte :  " + "0".repeat(Byt) + LengthBinaryNumber);
                                }
                                if (Input.equals("Short") || (Input.equals("short"))) {
                                    System.out.println("Short :  " + "0".repeat(Sho) + LengthBinaryNumber);
                                }
                                if (Input.equals("Int") || (Input.equals("int"))) {
                                    System.out.println("Int :  " + "0".repeat(In) + LengthBinaryNumber);
                                }
                                if (Input.equals("Long") || (Input.equals("long"))) {
                                    System.out.println("Long :" + "0".repeat(Lon) + LengthBinaryNumber);
                                }
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Byte :  " + "0".repeat(Byt) + LengthBinaryNumber + "\n" +
                                            "Short :  " + "0".repeat(Sho) + LengthBinaryNumber + "\n" +
                                            "Int :  " + "0".repeat(In) + LengthBinaryNumber + "\n" +
                                            "Long :  " + "0".repeat(Lon) + LengthBinaryNumber + "\n" +
                                            "Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)) + "\n" +
                                            "Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                            }
                            else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }


                        if (a <= 32767) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Short Int Long Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Short") || (Input.equals("short"))) {
                                    System.out.println("Short :  " + "0".repeat(Sho) + LengthBinaryNumber);
                                }
                                if (Input.equals("Int") || (Input.equals("int"))) {
                                    System.out.println("Int :  " + "0".repeat(In) + LengthBinaryNumber);
                                }
                                if (Input.equals("Long") || (Input.equals("long"))) {
                                    System.out.println("Long :  " + "0".repeat(Lon) + LengthBinaryNumber);
                                }
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Short :  " + "0".repeat(Sho) + LengthBinaryNumber + "\n" +
                                            "Int :  " + "0".repeat(In) + LengthBinaryNumber + "\n" +
                                            "Long :  " + "0".repeat(Lon) + LengthBinaryNumber + "\n" +
                                            "Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)) + "\n" +
                                            "Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
//                            System.out.println("Short :" + "0".repeat(Sho) + LengthBinaryNumber + "\n" +
//                                    "Int :" + "0".repeat(In) + LengthBinaryNumber + "\n" + "Long :" + "0".repeat(Lon) + LengthBinaryNumber + "\n" +
//                                    "Float :" + "0".repeat(Flo) + LengthBinaryNumber + "\n" + "Double :" + "0".repeat(Dou) + LengthBinaryNumber);
                            break;
                        }
                        if (a <= 2147483647) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Int Long Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Int") || (Input.equals("int"))) {
                                    System.out.println("Int :  " + "0".repeat(In) + LengthBinaryNumber);
                                }
                                if (Input.equals("Long") || (Input.equals("long"))) {
                                    System.out.println("Long :  " + "0".repeat(Lon) + LengthBinaryNumber);
                                }
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Int :  " + "0".repeat(In) + LengthBinaryNumber + "\n" +
                                            "Long :  " + "0".repeat(Lon) + LengthBinaryNumber + "\n" +
                                            "Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)) + "\n" +
                                            "Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }
                        if (a <= 9223372036854775807L) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Long Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Long") || (Input.equals("long"))) {
                                    System.out.println("Long :  " + "0".repeat(Lon) + LengthBinaryNumber);
                                }
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Long :  " + "0".repeat(Lon) + LengthBinaryNumber + "\n" +
                                            "Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)) + "\n" +
                                            "Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }
                        if (a <= 3.4E38) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)) + "\n" +
                                            "Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }
                        if (a <= 1.7E308) {
                            System.out.println("Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                        }
                            break;
                    }
                    if (a < 0) {
                        if (a >= -128) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Byte Short Int Long Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Byte") || (Input.equals("byte"))) {
                                    System.out.println("Byte :  " + 1 + "0".repeat(NegByt) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Short") || (Input.equals("short"))) {
                                    System.out.println("Short :  " + 1 + "0".repeat(NegSho) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Int") || (Input.equals("int"))) {
                                    System.out.println("Int :  " + 1 + "0".repeat(NegIn) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Long") || (Input.equals("long"))) {
                                    System.out.println("Long :  " + 1 + "0".repeat(NegLon) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  1" + Long.toBinaryString(Float.floatToIntBits((float) Math.abs(a))));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Byte :  " + 1 + "0".repeat(NegByt) + LengthNegBinaryNumber + "\n" +
                                            "Short :  " + 1 + "0".repeat(NegSho) + LengthNegBinaryNumber + "\n" +
                                            "Int :  " + 1 + "0".repeat(NegIn) + LengthNegBinaryNumber + "\n" +
                                            "Long :  " + 1 + "0".repeat(NegLon) + LengthNegBinaryNumber + "\n" +
                                            "Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))) + "\n" +
                                            "Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }
                        if (a > -32768) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Short Int Long Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Short") || (Input.equals("short"))) {
                                    System.out.println("Short :  " + 1 + "0".repeat(NegSho) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Int") || (Input.equals("int"))) {
                                    System.out.println("Int :  " + 1 + "0".repeat(NegIn) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Long") || (Input.equals("long"))) {
                                    System.out.println("Long :  " + 1 + "0".repeat(NegLon) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Short :" + 1 + "0".repeat(NegSho) + LengthNegBinaryNumber + "\n" +
                                            "Int :  " + 1 + "0".repeat(NegIn) + LengthNegBinaryNumber + "\n" +
                                            "Long :  " + 1 + "0".repeat(NegLon) + LengthNegBinaryNumber + "\n" +
                                            "Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))) + "\n" +
                                            "Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }
                        if (a > -2147483648) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Int Long Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Int") || (Input.equals("int"))) {
                                    System.out.println("Int :  " + 1 + "0".repeat(NegIn) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Long") || (Input.equals("long"))) {
                                    System.out.println("Long :  " + 1 + "0".repeat(NegLon) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  1" + Integer.toBinaryString(Float.floatToIntBits((float) Math.abs(a))));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Int :  " + 1 + "0".repeat(NegIn) + LengthNegBinaryNumber + "\n" +
                                            "Long :  " + 1 + "0".repeat(NegLon) + LengthNegBinaryNumber + "\n" +
                                            "Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))) + "\n" +
                                            "Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }
                        if (a > -9223372036854775808L) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Long Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Long") || (Input.equals("long"))) {
                                    System.out.println("Long :  " + 1 + "0".repeat(NegLon) + LengthNegBinaryNumber);
                                }
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Long :  " + 1 + "0".repeat(NegLon) + LengthNegBinaryNumber + "\n" +
                                            "Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))) + "\n" +
                                            "Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }
                        if (a > -3.4E38) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(Math.abs(a)))));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))) + "\n" +
                                            "Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }
                        if (a > -1.7E308) {
                            System.out.println("Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                            break;
                        }
                    }
                }
            }
            if (a % 1 != 0) {
                for (; ; ) {
//                    String LengthBinaryNumber = RealBinar((long) a);  // Бинарное  положительное число
//                    int Byt = 8 - LengthBinaryNumber.length();  // Вычисляем сколько нулей должно остаться в типе Byte
//                    int Sho = 16 - LengthBinaryNumber.length();
//                    int In = 32 - LengthBinaryNumber.length();
//                    int Lon = 64 - LengthBinaryNumber.length();
//                    int Flo = 32 - LengthBinaryNumber.length();
//                    int Dou = 64 - LengthBinaryNumber.length();
//
//                    String LengthNegBinaryNumber = NegBinar((long) a);  // Бинарная дилина отрицательного числа
//                    int NegByt = 7 - LengthNegBinaryNumber.length();  // Вычисляем сколько нулей должно остаться в типе Byte
//                    int NegSho = 15 - LengthNegBinaryNumber.length();
//                    int NegIn = 31 - LengthNegBinaryNumber.length();
//                    int NegLon = 63 - LengthNegBinaryNumber.length();
//                    int NegFlo = 31 - LengthNegBinaryNumber.length();
//                    int NegDou = 63 - LengthNegBinaryNumber.length();
                    if (a >= 0) {
                        if (a < 3.4E38) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Float :  0" + Long.toBinaryString(Float.floatToRawIntBits((float) a)) + "\n" +
                                            "Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
//                            var10000 = System.out;
//                            var10001 = "0".repeat(Flo);
//                            var10000.println("Float :" + var10001 + LengthBinaryNumber + "\nDouble :" + "0".repeat(Dou) + LengthBinaryNumber);
                            break;
                        }

                        if (a < 1.7E308) {
                            System.out.println("Double :  0" + Long.toBinaryString(Double.doubleToRawLongBits(a)));
                            }
//                    System.out.println("Double :");
                            break;
                        }
                    if (a < 0) {   // Отрицательные числа
                        if (a > -3.4E38) {
                            if (sc.hasNextLine()) { // возвращает истинну если с потока ввода можно считать строчку
                                System.out.println("В каком типе вывести число ? Float Double  all");
                                Scanner in = new Scanner(System.in);
                                String Input = in.nextLine();
                                in.close();
                                if (Input.equals("Float") || (Input.equals("float"))) {
                                    System.out.println("Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))));
                                }
                                if (Input.equals("Double") || (Input.equals("double"))) {
                                    System.out.println("Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                                if (Input.equals("All") || (Input.equals("all"))) {
                                    System.out.println("Float :  1" + Long.toBinaryString(Float.floatToRawIntBits((float) Math.abs(a))) + "\n" +
                                            "Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                                }
                            } else {
                                System.out.println("Вы ввели не слово.");
                            }
                            break;
                        }

                        if (a > -1.7E308) {
                            System.out.println("Double :  1" + Long.toBinaryString(Double.doubleToRawLongBits(Math.abs(a))));
                        }
                    }

                    }
                }
            }else{
            System.out.println("Вы ввели не число");
        }
    }


    public static String Binar ( long a){
        long b;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        return temp;
    }

    public static String NegBinar ( long a){
        long a2 = Math.abs(a);
        long b;
        String temp = "";
        while (a2 != 0) {
            b = a2 % 2;
            temp = b + temp;
            a2 = a2 / 2;
        }
        return temp;
    }

//    public static String RealBinar(double d){
//        int i;
//        int[] a = new int[7];
//        String rest = "";
//        String rast = "";
//        for ( i = 0; i < 8; i++) {   //начинаем
//            if ((int) Math.floor(d*2)==0) {//(1) умножаем каждый  раз нашу мантиссу  на 2 и проверяем равна ли целая часть 0
//                a[i]=0;// если равна нулю  то присваиваем    i-тому  элементу значение нуль .
//            }
//            else {
//                a[i]=1;// если же целая часть равна не равна нулю то выполняется  else в котором a[i] присваивается значение 1
//                d=d%1;// Берем значения после  запятой , например 0.12314241  , проверить условие (1) без целых чисел
//            }
//            for ( i = 0; i < 8; i++) {
//                System.out.print(a[i]);
//                rast = rest + a[i];
//            }
//
//        }
//
//        return rast;
//    }



//    public static String RealBinar(double a) {
//        double Mantisa = 0;
//        for(;a % 1 != 0; a *= 10)  {
//            Mantisa = a * 10;
//        }
//        double defol = 0;
//        for (;Mantisa != a; Mantisa /=10){
//            defol = Mantisa % 10;
//        }
//        System.out.println(defol);
//        return temp;
//    }


//    public static String NegRealBinar ( double a){
//        double a2 = Math.abs(a);
//        double b;
//        String temp = "";
//        while (a2 != 0) {
//            b = a2 % 2;
//            temp = b + temp;
//            a2 = a2 / 2;
//        }
//        return temp;
//    }
}