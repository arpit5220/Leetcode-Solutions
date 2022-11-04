# The Even Array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string contains 'E' and 'O', 'E' represents a number is even and 'O' represents a number is odd.</span> <span style="font-size:18px">To make an element even, you can add 1 to any odd element of the array. Also, when any element of the array is converted to even, any neighboring element which is odd, can also be made even without adding 1. The task is to find the minimum number of additions required to make all the elements even. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> S = "EOOE"
<strong>Output:</strong> 1
<strong>Explanation:</strong> Add 1 to 2nd element, 
it's neighbour 3rd element will 
convert into even. </span></pre>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> S = "EOOOOE"
<strong>Output:</strong> 1
<strong>Explanation:</strong> Add 1 to 2nd element, 
it's neighbour 3rd element will 
convert into even. Then 4th and 
5th elements too</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>convertToEven()&nbsp;</strong>which takes a string as inputs and returns the minimum number of additions required. </span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(|S|).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= |S| &lt; 10<sup>5</sup> </span></p>
</div>