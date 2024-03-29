# Maximum Depth Of Binary Tree
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a binary tree, find its <strong>maximum</strong>&nbsp;<strong>depth</strong>.<br>A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #202224; --darkreader-inline-border-top: #3b4143; --darkreader-inline-border-right: #3b4143; --darkreader-inline-border-bottom: #3b4143; --darkreader-inline-border-left: #3b4143;" data-darkreader-inline-bgimage="" data-darkreader-inline-bgcolor="" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left=""><span style="font-size: 18px;"><strong>Input:</strong><br>&nbsp;root&nbsp; --&gt;&nbsp; &nbsp; &nbsp;1<br>  &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; /&nbsp;&nbsp; \<br>  &nbsp; &nbsp; &nbsp; &nbsp;   3&nbsp; &nbsp;  2<br>  &nbsp; &nbsp; &nbsp; &nbsp;  /<br>  &nbsp; &nbsp; &nbsp; &nbsp; 4 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><br><strong><span style="font-size: 18px;">Output:</span></strong><span style="font-size: 18px;"> 3<br><strong>Explanation:</strong><br>Maximum depth is between nodes 1 and 4, which is 3.</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
 root --&gt;    10
           /    \
          20    30
           \      \  
           40     60
                  /
                 2 </span>
<strong><span style="font-size: 18px;">Output: </span></strong><span style="font-size: 18px;">4
<strong>Explanation:</strong>
Maximum depth is between nodes 10 and 2, which is 4
</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task: &nbsp;</strong><br>You don't need to read input or print anything. Complete the function <strong>maxDepth()</strong> which takes the root node as an input parameter and returns the maximum depth.</span><br>&nbsp;<br><span style="font-size: 18px;"><strong>Expected Time Complexity: </strong>O(N)<br><strong>Expected Auxiliary Space: </strong>O(height of the tree)</span><br>&nbsp;<br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N ≤ 10^5</span></p></div>