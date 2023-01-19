package day21_multiDimensionalArrays;

public class Task1_CydeoStudents {
    public static void main(String[] args) {
        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        //index of each 1D group:       0               1              2
        //String[][] batch1Groups = {batch1Group1, batch1Group1, batch1Group3}; OR:

        String[][] batch1Groups = new String[3][];
        batch1Groups[0] = batch1Group1;
        batch1Groups[1] = batch1Group2;
        batch1Groups[2] = batch1Group3;

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        //String[][] batch2Groups = {batch2Group1, batch2Group1, batch2Group3}; OR:
        String[][] batch2Groups = new String[3][];
        batch2Groups[0] =batch2Group1;
        batch2Groups[1] =batch2Group2;
        batch2Groups[2] =batch2Group3;

//declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

        String[][][] cydeoStudents = new String[2][][];

        cydeoStudents[0]= batch1Groups;
        cydeoStudents[1]= batch2Groups;

        //Print the names of each students
        for (String[][] each2DBatch : cydeoStudents) {
            for (String[] each1DGroup : each2DBatch) {
                for (String eachStudent : each1DGroup) {
                    System.out.println(eachStudent);
                }
            }
        }


        /*
        1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};
2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group1 to each indexes
				 of the variable batch1Groups

		3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students


         */
    }
}
