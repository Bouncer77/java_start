public class Merger {

    public static int[] merge_int_array(int[] a, int[] b) {

        int[] res = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        while (aIndex + bIndex != res.length) {

            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, res, aIndex + bIndex, a.length + b.length - aIndex - bIndex);
                break;
            }

            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, res, aIndex + bIndex, a.length + b.length - aIndex - bIndex);
                break;
            }

            if (a[aIndex] < b[bIndex]) {
                res[aIndex + bIndex] = a[aIndex++];
            } else {
                res[aIndex + bIndex] = b[bIndex++];
            }
        }
        return res;
    }

    public static int[] merge_int_array_old_version(int[] data1, int[] data2) {
        int[] res_data = new int[data1.length + data2.length];
        for (int i = 0, j = 0, k = 0; k < res_data.length; ++k) {
            if (data1[i] < data2[i]) {
                res_data[k] = data1[i];
                ++i;
                if (data1.length == i) {
                    ++k;
                    System.arraycopy(data2, j, res_data, k, data2.length - j);
                    break;
                }

            } else {
                res_data[k] = data2[j];
                //System.out.println("res_data[" + k + "] = data2[" + j + "] = " + data2[k]);
                ++j;
                if (data2.length == j) {
                    ++k;
                    System.arraycopy(data1, i, res_data, k, data1.length - i);
                    break;
                }
            }
        }
        return res_data;
    }
}
