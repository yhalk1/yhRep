package pack;

public class LimitsOfTypesApp {
    public static void main (String[] args){

        int charMinValue = Character.MIN_VALUE;
        int charMaxValue = Character.MAX_VALUE;

      System.out.println(String.format("Byte min value is: %d and max is: %d ", Byte.MIN_VALUE, Byte.MAX_VALUE));
      System.out.println(String.format("Short min value is: %d and max is: %d ", Short.MIN_VALUE, Short.MAX_VALUE));
      System.out.println(String.format("Char min value is: %d and max is: %d ", charMinValue, charMaxValue));
      System.out.println(String.format("Integer min value is: %d and max is: %d ", Integer.MIN_VALUE, Integer.MAX_VALUE));
      System.out.println(String.format("Long min value is: %d and max is: %d ", Long.MIN_VALUE, Long.MAX_VALUE));
      System.out.println(String.format("Float min value is: %f and max is: %f ", Float.MIN_VALUE, Float.MAX_VALUE));
      System.out.println(String.format("Double min value is: %f and max is: %f ", Double.MIN_VALUE, Double.MAX_VALUE));

    }
}
