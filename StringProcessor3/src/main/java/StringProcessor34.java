public class StringProcessor34
{
    public String method3(String str)
    {
        String res="";
        StringBuffer buff=new StringBuffer();
        char[] chars = str.toCharArray();
        for(int i=0;i<str.length();i++) {
            if (chars[i]=='1') {
                buff.append("один");


            }
            else if (chars[i]=='2') {
                buff.append("два");
            }
            else if (chars[i]=='3') {
                buff.append("три");

            }
            else
                buff.append(chars[i]);

        }

        res= buff.toString();

        return res;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String method4(String str)
    {
        StringBuilder strB=new StringBuilder();
        for(int i=0;i<str.length();i+=2) {
            strB.append(str.charAt(i));
        }
        return strB.toString();
    }
}
class Program {
    public static void main(String args[]){
        StringProcessor34 sp=new StringProcessor34();


        System.out.println( sp.method3("A3lla is ready for 1 2 3"));
       System.out.println( sp.method4("cat is my animal"));
    }
}
