class Solution {
    private int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target);
        return answer;
    }

    private void dfs(int[] numbers, int depth, int target) {
        if (depth == numbers.length) {
            int sum = 0;

            for (int number : numbers) {
                sum += number;
            }

            if (sum == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, depth + 1, target);
        numbers[depth] = numbers[depth] * -1;
        dfs(numbers, depth + 1, target);
    }
}