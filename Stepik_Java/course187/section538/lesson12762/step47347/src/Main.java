class Main {
//Please note, only the code BELOW will be sent to Stepik.org
//Stepik code: start

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        for (int i = 0, aIndex = 0, bIndex = 0; i < res.length; ++i) {
            if (a1[aIndex] > a2[bIndex]) {
                res[i] = a2[bIndex++];
            } else {
                res[i] = a1[aIndex++];
            }

            if (a1.length == aIndex) {
                for (int n = i + 1; n < res.length; ++n) {
                    res[n] = a2[bIndex++];
                }
                break;
            } else if (a2.length == bIndex) {
                for (int n = i + 1; n < res.length; ++n) {
                    res[n] = a1[aIndex++];
                }
                break;
            }
        }

        return res; // your implementation here
    }
//Stepik code: end
//Please note, only the code ABOVE will be sent to Stepik.org
}