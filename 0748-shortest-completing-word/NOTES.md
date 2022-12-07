My Code But NOt Able To Complete
​
class Solution {
public String shortestCompletingWord(String licensePlate, String[] words) {
String ans="";
int length=Integer.MAX_VALUE;
for(int i=0;i<words.length;i++)
{
String str=words[i];
if(check(str,licensePlate))
{
if(str.length()<length)
{
length=str.length();
ans=str;
}
}
}
return ans;
}
public static boolean check(String str,String licensePlate)
{
HashMap<Character,Integer> hm1=new HashMap<>();
for(int i=0;i<licensePlate.length();i++)
{
char ch=Character.toLowerCase(licensePlate.charAt(i));
if(ch>=97 && ch<=122)
{
hm.put(ch,hm.getOrDefault(ch,0)+1);
}
}
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
hm1.put(ch,hm1.getOrDefault(ch,0)+1);
}
for(char key:hm.keySet())
{
if(hm1.containsKey(key))
{
if(hm1.get(key)>=hm.get(key))
{
continue;
}
}
else
return false;
}
return true;
}
}
​
​