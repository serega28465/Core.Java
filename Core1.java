public class Main {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Good bye";
		System.out.println(compateTo(s,s1));
	}

	static int compateTo(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int lim = Math.min(len1, len2);
        char v1[] = str1.toCharArray();
        char v2[] = str2.toCharArray();
 
        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
   }
}
