public class Week4 {
    /**
     * return max value between a and b.
     *
     * @param a : value a
     * @param b : value b
     * @return : return max value between a and b
     */
    public static int max2Int(int a, int b) {
        //return (a > b) ? a : b;


        return Math.max(a,b);
    }


    /**
     * return min value of array.
     *
     * @param array: array
     * @return: min value of array
     */
    public static int minArray(int[] array) {
        int minVal = array[0];

        if (array.length == 0) {
            return -1;
        }

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < minVal) {
//                minVal = array[i];
//            }
//        }

        for (int i: array) {
            if (i < minVal) {
                minVal = i;
            }
        }
        return minVal;
    }

    /**
     * calculate bmi.
     *
     * @param weight: weight
     * @param height: height
     * @return: health assessment
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10.0) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
