class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (char task : tasks) {
            int count = map.getOrDefault(task, 0) + 1;
            map.put(task, count);
            maxCount = Math.max(maxCount, count);
        }

        int maxCountTasks = 0;
        for (int count : map.values()) {
            if (count == maxCount) {
                maxCountTasks++;
            }
        }
        int chunkCount = ((maxCount-1) * (n+1)) + maxCountTasks;

        return Math.max(chunkCount, tasks.length);
    }
}
[
