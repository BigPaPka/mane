import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Vector3DArrayTest {
    private Vector3DArray vector3DArray = new Vector3DArray(5);

    @Test
    public void testGetMaxLength() {
        Vector3D vector1 = new Vector3D();
        vector1.setX(1);
        vector1.setY(2);
        vector1.setZ(2);


        vector3DArray.set(0,vector1);
        vector3DArray.set(1,vector1);
        vector3DArray.set(2,vector1);
        vector3DArray.set(3,vector1);
        vector3DArray.set(4,vector1);



        assertEquals(vector3DArray.maxVectorLength(), 3.0,0);
    }


    @Test
    public void testGetElement() {
        Vector3DArray vector3DArray5 = new Vector3DArray(5);
        Vector3D vector1 = new Vector3D();
        vector1.setX(1);
        vector1.setY(2);
        vector1.setZ(2);


        vector3DArray5.set(0,vector1);
        vector3DArray5.set(1,vector1);
        vector3DArray5.set(2,vector1);
        vector3DArray5.set(3,vector1);
        vector3DArray5.set(4,vector1);
        assertEquals(vector3DArray5.getElement(0), new Vector3D(1, 2, 2));
    }


    @Test
    public void testGetMaxLength2() {
        Vector3D vector1 = new Vector3D();
        vector1.setX(0);
        vector1.setY(0);
        vector1.setZ(0);


        vector3DArray.set(0,vector1);
        vector3DArray.set(1,vector1);
        vector3DArray.set(2,vector1);
        vector3DArray.set(3,vector1);
        vector3DArray.set(4,vector1);


        //  double len = new Vector3D(1, 2, 2).getLength();
        assertEquals(vector3DArray.maxVectorLength(), 0.0,0);
    }






@Test
    public void setUp() { //замена i-эл на зад.вектор
        vector3DArray = new Vector3DArray(5);
        Vector3D vector3D = new Vector3D(1, 2, 3);
        vector3DArray.set(0, vector3D);
        Vector3D v = new Vector3D(3, 2, 2);
        vector3DArray.set(3, v);
        assertEquals(vector3DArray.getElement(0),vector3D);
        assertEquals(vector3DArray.getElement(3),v);
    }

    @Test
    public void testLinCombination() {
        Vector3D vector1 = new Vector3D();
        vector1.setX(2);
        vector1.setY(-1);
        vector1.setZ(0);
        vector3DArray.set(0,vector1);
        Vector3D vector3 = new Vector3D();


        double[] koef = {2, 0, 0,0,0}; //5-dl vect
        assertEquals(vector3DArray.lineCombination(koef), new Vector3D(4, -2, 0));//2*2,-1*2,0*2

    }

    @Test
    public void testLength() {
        assertEquals(vector3DArray.length(), 5);
    }





//constain.поиск заданного вектора в массиве
    @Test
    public void testFindIndex() {
        Vector3D vector1 = new Vector3D();
        vector1.setX(5);
        vector1.setY(5);
        vector1.setZ(5);
        vector3DArray.set(0,vector1);




        Vector3D v = new Vector3D(5, 5, 5);
        assertEquals(vector3DArray.contains(v), 0);
    }
    @Test
    public void testFindIndex2() {
       Vector3D vector1 = new Vector3D();
        vector1.setX(5);
        vector1.setY(5);
        vector1.setZ(5);
        vector3DArray.set(0,vector1);


        Vector3D v = new Vector3D(0, 22, 2);
        assertEquals(vector3DArray.contains(v), -1);
    }



    @Test
    public void testSumVectors() {
        Vector3DArray vector3DArray1 = new Vector3DArray(2);

        Vector3D sum = new Vector3D(4, 4, 4);
        vector3DArray1.set(0,sum);
        vector3DArray1.set(1,sum);
        assertEquals(vector3DArray1.sumAllVectors(), sum= new Vector3D(8,8,8));//4+4,4+4,4+4
    }
/*
  Vector3D sum = new Vector3D(4, 4, 5);
        assertEquals(varray.sumAllVectors(), sum);
 */

    @Test
    public void testPoint() {
        vector3DArray = new Vector3DArray(5);
        Vector3D vector3D = new Vector3D(1, 2, 3);
        vector3DArray.set(0, vector3D);
        Vector3D v = new Vector3D(3, 2, 2);
        vector3DArray.set(3, v);

        Point3D point = new Point3D(1, 1, 1);
        Point3D[] expected = new Point3D[5];
        for (int i = 0; i < 5; i++) {
            expected[i] = new Point3D(1, 1, 1); //
        }
        expected[0] = new Point3D(2, 3, 4);
        expected[3] = new Point3D(4, 3, 3);

        assertEquals(vector3DArray.pointSwap(point), expected);
        /*
        1+1  2+1  3+1
        0+1  0+1  0+1
        3+1  2+1  2+1
        0+1  0+1  0+1



         */

    }

    @Test
    public void testPoint1() {
        vector3DArray = new Vector3DArray(5);
        Vector3D vector3D = new Vector3D(2, 3, 4);
        vector3DArray.set(0, vector3D);
        Vector3D v = new Vector3D(4, 4, 4);
        vector3DArray.set(3, v);
        Point3D point = new Point3D(2, 2, 2);
        Point3D[] expected = new Point3D[5];
        for (int i = 0; i < 5; i++) {
            expected[i] = new Point3D(2, 2, 2); //
        }
        expected[0] = new Point3D(4, 5, 6);
        expected[3] = new Point3D(6, 6, 6);

        assertEquals(vector3DArray.pointSwap(point), expected);

/*
2+2  3+2  4+2
0+2  0+2  0+2
0+2  0+2  0+2
4+2  4+2  4+2
0+2  0+2  0+2
 */
    }

    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        vector3DArray = new Vector3DArray(5);
        Vector3D vector3D = new Vector3D(1, 2, 3);

        Throwable thrown = assertThrows(Exception.class, () -> new Vector3DArray(-1));
        assertNotNull(thrown.getMessage());

        thrown= assertThrows(Exception.class, () -> vector3DArray.set(-1,vector3D)); //ind<0
        assertNotNull(thrown.getMessage());
        thrown= assertThrows(Exception.class, () -> vector3DArray.set(7,vector3D));//ind>size
        assertNotNull(thrown.getMessage());


    }

}