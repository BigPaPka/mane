public class StringProcessor
{
    /*
   На входе строка s и целое число N. Выход — строка, состоящая из N копий строки s,
записанных подряд. При N = 0 результат — пустая строка. При N < 0 выбрасывается
исключение.
    */
    public String method1(String str,int N){
        if(N<0){
            try {
                throw new Exception("Число N<0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(N==0){
            str="";
            System.out.println(str);
        }
        else {
            for (int i = 0; i < N; i++) {
                System.out.println(str);
            }
        }
        return str;
    }
    ////////////////////////////////////////////////////////////////////
    /*
    На входе две строки. Результат — количество вхождений второй строки в первую.
Если вторая строка пустая или null, выбросить исключение.
     */
    public int method2(String str1,String str2) {
        int count = 0;                      //счетчик вхождений
        if (str2.isEmpty()|| str1.isEmpty()) {
            throw new IllegalArgumentException("srt2 ili st1 is empty");
        }
        else {
            for (int i = 0; i <= str1.length() - str2.length(); i++) {
                String substring = str1.substring(i, i + str2.length()); //получить подстроку
                if (substring.equals(str2)) {
                    count++;
                }
            }


        }
        return count;
    }
    /////////////////////////////////////////////////////////////////
    /*
    Постройте по строке новую строку, которая получена из исходной заменой каждого
символа '1' на подстроку "один”, символа ‘2’ на подстроку “два” и символа ‘3’ на
подстроку “три”.
     */
    public String method3(String str)
    {
        String res="";
        StringBuffer buff=new StringBuffer();
        char[] chars = str.toCharArray(); //преобразует строку в новый массив символов
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
                buff.append(chars[i]); //обновл знач

        }

        res= buff.toString();

        return res;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    В строке типа StringBuilder удалите каждый второй по счету символ. Должна быть
модифицирована входная строка, а не порождена новая.
     */
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
        StringProcessor sp=new StringProcessor();

        sp.method1("hello,Alla!",5);
        System.out.println( sp.method3("A3lla is ready for 1 2 3"));
        System.out.println( sp.method4("1"));
        System.out.println(sp.method2("Hello,my dear dear friend","dear"));

    }
}





