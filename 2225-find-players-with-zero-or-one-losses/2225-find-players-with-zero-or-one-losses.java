class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
     HashMap<Integer,Integer> winner = new HashMap<>();
	 HashMap<Integer,Integer> loser = new HashMap<>();

		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> win = new ArrayList<>();
		List<Integer> loss = new ArrayList<>();

		for(int i=0;i<matches.length;i++)
		{
			loser.put(matches[i][1],loser.getOrDefault(matches[i][1],0)+1);
			if(winner.containsKey(matches[i][1]))
			{
				winner.remove(matches[i][1]);
			}
			if(!loser.containsKey(matches[i][0]))
				winner.put(matches[i][0],winner.getOrDefault(matches[i][0],0)+1);

		}


		for(int j : winner.keySet())
		{
			win.add(j);
		}
		Collections.sort(win);

		for(Map.Entry<Integer,Integer>  ele : loser.entrySet())
		{
			if(ele.getValue()==1)
				loss.add(ele.getKey());
		}
		Collections.sort(loss);

		ans.add(win);
		ans.add(loss);
		return ans;        
    }
}