# Stopwatch task by Pannapat Panpakdee (5910546660)

I ran the tasks on MacBook Air, and got these results:

Task						 |         Time
- - - - - - - - - - - - - - - - - - - - - - - - —|- - - - — - -:
Append  50,000 chars to String			 |  1.017404 sec
Append 100,000 chars to String			 |  3.337505 sec
Append 100,000 chars to StringBuilder		 |  0.003357 sec
Add 1 billion double using array		 |  1.351324 sec
Add 1 billion Double using array		 |  7.138987 sec
Add 1 billion BigDecimal using array		 | 10.689458 sec

# Explanation of Results

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
- Because appending 100,000 chars to String need to create a String on memory more than appending 50,000 chars and it still keep the old value that make it takes more time.

Why is appending to StringBuilder so much different than appending to String?  What is happening to the String?
- Because appending to String always create a new String on memory when we put the new value and it still keep the old value on the memory then delete it later but StringBuilder is not the same, StringBuilder create a String that longer that the value that makes it doesn’t need to create a new String always. When the value reach the maximum it will create new String that longer than the old.

Explain difference in time to sum double, Double, and BigDecimal.  Which is faster and why?
- The fastest is double because it is a primitive, it doesn’t has a method or attribute.
Second is Double because it has a method and attribute. The Slowest is BigDecimal because it store a lot of data and contain all of decimal that makes it slower than Double and double.