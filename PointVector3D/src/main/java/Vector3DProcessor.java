public class Vector3DProcessor {
    public static Vector3D sum(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    public static Vector3D dif(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }

    public static double scalar(Vector3D v1, Vector3D v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    public static Vector3D otnkoord(Vector3D v1, Vector3D v2) {
        return new Vector3D(
                v1.getZ() * v2.getZ() - v1.getZ() * v2.getY(),
                v1.getZ() * v2.getX() - v1.getX() * v2.getZ(),
                v1.getX() * v2.getY() - v1.getY() * v2.getY()
        );

    }


    public static Vector3D vectisp(Vector3D vectorA, Vector3D vectorB) {
        Vector3D vectorAB = new Vector3D();
        vectorAB.setX(vectorA.getY() * vectorB.getZ() - vectorA.getZ() * vectorB.getY());
        vectorAB.setY(-(vectorA.getX() * vectorB.getZ() - vectorA.getZ() * vectorB.getX()));
        vectorAB.setZ(vectorA.getX() * vectorB.getY() - vectorA.getY() * vectorB.getX());
        return vectorAB;

    }


    public static boolean coll(Vector3D v1, Vector3D v2) {
        return otnkoord(v1, v2).equals(new Vector3D());
    }


   /* public static boolean equals(Vector3D vectorA, Vector3D vectorB) {
        Vector3D vectorC = new Vector3D();
        if (vectorC.equals(Vector3DProcessor.vec(vectorA, vectorB))) {
            return true;
        } else {
            return false;
        }


    }
}

    */
}