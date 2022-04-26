/*
1) конструктор по размеру (создает массив из нулевых векторов)+
2) длина массива+
3) замена i-го элемента массива на заданный вектор+
4) наибольшая длина вектора в массиве+
5) поиск заданного вектора в массиве (результат – индекс первого вхождения или
–1, если не найден)+
6) сумма всех векторов в массиве+
7) метод, который получает на вход массив вещественных чисел (коэффициентов)
и вычисляет линейную комбинацию векторов с заданными коэффициентами.
При несовпадении длин массивов векторов и коэффициентов, результатом
считать нулевой вектор (если кто-то знает, как работать с исключениями, то
выбросить исключение)+
8) метод, который получает на вход точку P (типа Point3D) и вычисляет массив
точек, каждая из которых – результат сдвига точки P, на соответствующий
вектор+
 */





public class Vector3DArray
{
    private final Vector3D[] arr;
    private final int size;



    Vector3DArray(int n) { //конструктор по размеру (создает массив из нулевых векторов)
        if (n <= 0) throw new ArithmeticException("Size");
        this.size = n;
        this.arr = new Vector3D[this.size];
        for (int i = 0; i < n; i++) {
            arr[i] = new Vector3D();
        }
    }

    public void set(int ind, Vector3D v) { //замена i-го элемента массива на заданный вектор
        if (ind < 0 || ind >= this.size) throw new ArithmeticException("Index");
        if (v == null) throw new NullPointerException("null");
        arr[ind] = v;
    }


    public double maxVectorLength() {//наибольшая длина вектора в массиве,
        double res = -1;
        double temp;

        for (Vector3D vector3D : arr) {
            temp = vector3D.getLength();
            if (temp > res) res = temp;
        }
        return res;
    }

    public int contains(Vector3D v) { //поиск заданного вектора в массиве (результат – индекс первого вхождения или –1, если не найден),
        if (v == null) throw new IllegalArgumentException("null");
        for ( int i = 0; i < this.arr.length; i++) {
            if (arr[i].equals(v)) return i;
        }
        return -1;
    }

    public int length() {            //длина массива
        return this.arr.length;
    }
    /*
    метод, который получает на вход точку P (типа Point3D) и вычисляет массив
    точек, каждая из которых – результат сдвига точки P, на соответствующий
    вектор.
     */
    public Point3D[] pointSwap(Point3D point) {
        if (point == null) throw new IllegalArgumentException("get null");
        Point3D[] data = new Point3D[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            data[i] = new Point3D(
                    point.getX() + arr[i].getX(),
                    point.getY() + arr[i].getY(),
                    point.getZ() + arr[i].getZ()
            );
        }
        return data;
    }

    public Vector3D sumAllVectors() { //сумма всех векторов в массиве,
        Vector3D res = arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            res = Vector3DProcessor.sum(res, arr[i]);
        }
        return res;
    }
    /*
    метод, который получает на вход массив вещественных чисел (коэффициентов)
    и вычисляет линейную комбинацию векторов с заданными коэффициентами.
    При несовпадении длин массивов векторов и коэффициентов, результатом
    считать нулевой вектор
     */
    public Vector3D lineCombination(double[] koefs) {
        if (koefs.length != arr.length) throw new IllegalArgumentException(" Err len");
        double x = 0;
        double y = 0;
        double z = 0;
        for (int i = 0; i < koefs.length; i++) {
            x += arr[i].getX() * koefs[i];
            y += arr[i].getY() * koefs[i];
            z += arr[i].getZ() * koefs[i];
        }
        return new Vector3D(x, y, z);
    }

    public Vector3D getElement(int index) { //
        return this.arr[index];
    }


}
/*
        "Добавить следущую зависимость"
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>${slf4j.version}</version>
</dependency>
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>${slf4j.version}</version>
</dependency>
 */