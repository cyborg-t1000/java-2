package hw2;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"11", "12", "13", "14"},
                {"15", "16", "17", "18"},
                {"21", "22", "23", "24"},
                {"25", "26", "27", "28"},
        };
        try {
            checkArrayIs4x4(array);
            System.out.println("Array sum is " + sumArray(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Array must be 4x4");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Parse to int error at: " + e.getX() + ", " + e.getY());
        }

    }

    private static void checkArrayIs4x4(String[][] array) throws MyArraySizeException {
        if (array.length != 4) throw new MyArraySizeException();
        for (String[] strings : array) {
            if (strings.length != 4) throw new MyArraySizeException();
        }
    }

    private static int sumArray(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}

