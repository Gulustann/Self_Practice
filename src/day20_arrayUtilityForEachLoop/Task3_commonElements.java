package day20_arrayUtilityForEachLoop;

public class Task3_commonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        int count =0;
        String commonElements ="";
        for (int i : arr1) {
            for (int j : arr2) {
                if(i==j){
                    commonElements +=i + " ";
                    count++;
                }
            }
        }
        System.out.println("Common elements: " + commonElements + " Count : " + count);



        /*
        3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

         */
    }
}
