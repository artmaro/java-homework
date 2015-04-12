package lec_2_types.homework;

/**
 Which lines WILL NOT compile? (Choose all that apply.)/Какая строчка не скомпилируется?
 A. Line A
 B. Line B
 C. Line C
 D. Line D
 E. Line E

 */
public class Fishing {
    byte b1 = 4;
    int i1 = 123456;
    long L1 = (long)i1; // line A
    short s2 = (short)i1; // line B
    byte b2 = (byte)i1; // line C
    int i2 = (int)123.456; // line D
    byte b3 = b1 + 7; // line E
}