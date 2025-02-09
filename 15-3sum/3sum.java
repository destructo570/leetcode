class Solution {
public List<List<Integer>> threeSum(int[] nums) {
        return optimised(nums);
    }

    public List<List<Integer>> optimised(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j=i+1, k=n-1;
            
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++; k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }

        return ans;
    } 

    public List<List<Integer>> naive(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> tmp = new ArrayList<>();
                        // tmp.addAll(i,j,k);
                        Collections.addAll(tmp, nums[i],nums[j],nums[k]);
                        ans.add(tmp);
                    }
                }
            }
        }
        return removeDuplicates(ans);
        // return new ArrayList<>(ans);
    }

     public static List<List<Integer>> removeDuplicates(List<List<Integer>> lists) {
        Set<String> uniqueSet = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> list : lists) {
            // Sort the list to ensure consistent order for comparison
            Collections.sort(list);
            
            // Convert to string for uniqueness check
            String key = list.toString();
            
            if (!uniqueSet.contains(key)) {
                uniqueSet.add(key);
                result.add(new ArrayList<>(list)); // Add a new copy to result
            }
        }

        return result;
    }
}