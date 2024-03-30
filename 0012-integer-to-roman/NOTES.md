어마어마한 노가다로 풀었지만 시간은 나쁘지 않았다고 생각했던 문제이다..
예외를 몇 개 나눠야한다는 생각까지는 했지만.. 내가 생각한 것 보다 훨씬 간단하게 풀 수 있었다.

여러가지 드는 생각이 있었지만 그 중 가장 크게 든 생각은 내가 생각한 풀이를 좀 더 간단하게 하는 방법은 얼마든지 존재한다는 것이다.

위의 문제를 간단하게 푸는 방법은 다음과 같다.

1. 예외적으로 나올 수 있는 문자들을 미리 정의해둔다. 현재 범위 안에서는 1000, 900 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1이 있다.
2. 내가 입력한 특정 숫자를 위의 배열의 0번칸에서부터 뺀다.
3. 만약 0번칸의 숫자가 내가 입력한 숫자보다 크다면 다음 칸과 비교하는 방식으로 체크해나간다.

```
class Solution {
    public String intToRoman(int num) {
        int[] codeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] stringRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<codeInt.length; i++) {
            while(num >= codeInt[i]) {
                sb.append(stringRoman[i]);
                num = num-codeInt[i];
            }
        }
        return sb.toString();
    }
}
