public abstract class Operation {
    public abstract double apply(double number);

    double applyTriple(double number){
        for(int i=0;i<3;i++){
            number= apply(number);
        }
        return number;
    }

}
class IdenticalOperation extends Operation{
    public  double apply(double number){ return number;}
}
class SqrtOperation extends Operation{
    public double apply(double number){ return Math.sqrt(number);}
}
class TangentOperation extends Operation{
    public  double apply(double number){ return Math.tan(number);}
}
