public interface FunctOfOneArgument <T extends OneRealArgument> { //тип функции(lin,sin,exp,rational)
    //2.3
    //параметр ограниченного типа: <T extends ABC>/возвращаемый тип: T
    double calculate(T func);



}
