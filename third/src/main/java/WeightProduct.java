

//«Весовой товар»
//Весовой товар хранит название и описание.
public class WeightProduct extends  Product{ //наследования свойств класса
    public WeightProduct(String name, String description)
    {
        super(name, description);// конструктор, который принимает 2 параметра(обратиться  к родительскому методу на текущем объекте (this))
    }
}
