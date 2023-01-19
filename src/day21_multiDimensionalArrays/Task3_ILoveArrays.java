package day21_multiDimensionalArrays;

public class Task3_ILoveArrays {
    public static void main(String[] args) {
        String[][][][][][][][][][]  array10D = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};    //10D array
        for (String[][][][][][][][][] array9D : array10D) {
            for (String[][][][][][][][] array8D : array9D) {
                for (String[][][][][][][] array7D : array8D) {
                    for (String[][][][][][] array6D : array7D) {
                        for (String[][][][][] array5D : array6D) {
                            for (String[][][][] array4D : array5D) {
                                for (String[][][] array3D : array4D) {
                                    for (String[][] array2D : array3D) {
                                        for (String[] array1D : array2D) {
                                            for (String elements : array1D) {
                                                System.out.println(elements);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }





        /*
        Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each elements of the given array

         */
    }
}
