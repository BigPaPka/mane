public class StringProcessor2
{
    public int method2(String str1,String str2) {
        int count = 0;                      //счетчик вхождений
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("srt2 is empty");
        }
        else {
            for (int i = 0; i <= str1.length() - str2.length(); i++) {
                String substring = str1.substring(i, i + str2.length());
                if (substring.equals(str2)) {
                    count++;
                }
            }


        }
        return count;
    }

}
class Program {
    public static void main(String args[]){
        StringProcessor2 sp=new StringProcessor2();


System.out.println(sp.method2("Hello,my dear dear friend","dear"));
    }
}
