/* Write a method doubleList that takes an ArrayList of Strings as a parameter 
 * and that replaces every string with two of that string.
 */
public void doubleList(ArrayList<String> list)
{
    for(int i = 0; i < list.size(); i += 2)
    {
        String str = list.get(i);
        list.add(i + 1, str);
    }
}
