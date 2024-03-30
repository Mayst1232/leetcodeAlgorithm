class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        StringBuilder save = new StringBuilder();
        int count = 0;

        while(num > 0) {

            int a = num % 10;
            num /= 10;

            a = a * (int) Math.pow(10, count);
            count++;

            if(a == 4) {
                sb.insert(0, "IV");
            } else if(a == 9) {
                sb.insert(0, "IX");
            } else if(a == 40) {
                sb.insert(0, "XL");
            } else if(a == 90) {
                sb.insert(0, "XC");
            } else if(a == 400) {
                sb.insert(0, "CD");
            } else if(a == 900) {
                sb.insert(0, "CM");
            } else if(a >= 1 && a <= 3) {
                save.append("I".repeat(a));
                sb.insert(0, save);
                save.setLength(0);
            } else if(a >= 5 && a <= 8) {
                save.append("V");
                save.append("I".repeat(a - 5));
                sb.insert(0, save);
                save.setLength(0);
            } else if(a >= 10 && a <= 30) {
                save.append("X".repeat(a/10));
                sb.insert(0, save);
                save.setLength(0);
            } else if(a >= 50 && a <= 80) {
                save.append("L");
                save.append("X".repeat(a/10 - 5));
                sb.insert(0, save);
                save.setLength(0);
            } else if(a >= 100 && a <= 300) {
                save.append("C".repeat(a/100));
                sb.insert(0, save);
                save.setLength(0);
            } else if(a >= 500 && a <= 800) {
                save.append("D");
                save.append("C".repeat(a/100 - 5));
                sb.insert(0, save);
                save.setLength(0);
            } else if(a >= 1000 && a <= 3000) {
                save.append("M".repeat(a/1000));
                sb.insert(0, save);
                save.setLength(0);
            }
        }

        return sb.toString();
    }
}
